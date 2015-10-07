package liquibasedemo;

import liquibasedemo.data.Movie;
import liquibasedemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    @ResponseBody
    public List<Movie> getAllMovies() {
        return service.findAll();
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Movie getMovie(@PathVariable("id") Integer id) {
        return service.findById(id);
    }


}
