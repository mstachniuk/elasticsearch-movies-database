package liquibasedemo.service;

import liquibasedemo.data.Movie;
import liquibasedemo.repository.MovieHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieHome movieHome;

    @Transactional
    public List<Movie> findByTitle(String name) {
        List<Movie> movies = movieHome.findByTitle(name);
        movies.stream().forEach(m -> m.getRoles().size());  // read lazy roles
        return movies;
    }

    @Transactional
    public void save(Movie movie) {
        movieHome.persist(movie);
    }

    public List<Movie> findAll() {
        return movieHome.findAll();
    }

    @Transactional
    public Movie findById(int id) {
        return movieHome.findById(id);
    }
}
