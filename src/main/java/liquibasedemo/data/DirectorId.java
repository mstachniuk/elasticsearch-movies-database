package liquibasedemo.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class DirectorId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "movieid")
    private Movie movie;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "directorid")
    private Director director;

    @JsonIgnore
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
