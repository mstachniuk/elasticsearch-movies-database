package liquibasedemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liquibasedemo.data.Movie;
import liquibasedemo.repository.MovieHome;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdminService {

    public static final int PAGE_SIZE = 100;

    private Logger logger = LoggerFactory.getLogger(AdminService.class);

    @Autowired
    private MovieHome movieHome;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @Transactional
    public void reindexAllMovies() {
        Client client = new TransportClient()
                .addTransportAddress(new InetSocketTransportAddress("localhost", 9300));

        long amountOfMovies = movieHome.getAmountOfMovies();
        for (int i = 0; i < amountOfMovies / PAGE_SIZE; i++) {
            List<Movie> movies = movieHome.findAll(i, PAGE_SIZE);
            movies.stream().forEach(movie -> {
                IndexResponse response = null;
                try {
                    response = client
                            .prepareIndex("esmd", "movie", String.valueOf(movie.getMovieid()))
                            .setSource(jacksonObjectMapper.writeValueAsString(movie))
                            .execute()
                            .actionGet();
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                logger.debug("response: " + response);
            });
        }

        client.close();
    }
}
