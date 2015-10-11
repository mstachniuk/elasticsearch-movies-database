package liquibasedemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liquibasedemo.data.Movie;
import liquibasedemo.repository.MovieHome;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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

    private Client client = null;

    public AdminService() {

    }

    @PostConstruct
    public void init() {
        client = new TransportClient()
                .addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
    }

    @Transactional
    public void reindexAllMovies() {
        indexMovies(0);

    }

    @Transactional
    public void continueIndexMovies() {
        int maxMovieId = getMaxMovieId();
        indexMovies(maxMovieId / PAGE_SIZE);

    }

    private int getMaxMovieId() {
//        POST /esmd/movie/_search
//        {
//            "query": {
//            "match_all": {}
//        },
//            "sort": {
//            "movieid": "desc"
//        },
//            "size": 1
//        }
        SearchResponse searchResponse = client.prepareSearch("esmd")
                .setTypes("movie")
//                .setSearchType()
                .setQuery(QueryBuilders.matchAllQuery())
                .addSort(SortBuilders.fieldSort("movieid").order(SortOrder.DESC))
                .setFrom(0)
                .setSize(1)
                .execute()
                .actionGet();

        Integer id = Integer.valueOf(searchResponse.getHits().getHits()[0].getId());
        return id;
    }

    private void indexMovies(int start) {

        long amountOfMovies = movieHome.getAmountOfMovies();

        for (int i = start; i < amountOfMovies / PAGE_SIZE; i++) {
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
