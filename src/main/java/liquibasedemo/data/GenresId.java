package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GenresId generated by hbm2java
 */
@Embeddable
public class GenresId implements java.io.Serializable {

    private int movieid;
    private String genre;

    public GenresId() {
    }

    public GenresId(int movieid, String genre) {
        this.movieid = movieid;
        this.genre = genre;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "genre", nullable = false, length = 50)
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof GenresId))
            return false;
        GenresId castOther = (GenresId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getGenre() == castOther.getGenre()) || (this.getGenre() != null
                && castOther.getGenre() != null && this.getGenre().equals(castOther.getGenre())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getGenre() == null ? 0 : this.getGenre().hashCode());
        return result;
    }

}
