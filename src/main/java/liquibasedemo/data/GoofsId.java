package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GoofsId generated by hbm2java
 */
@Embeddable
public class GoofsId implements java.io.Serializable {

    private int movieid;
    private String gooftext;

    public GoofsId() {
    }

    public GoofsId(int movieid) {
        this.movieid = movieid;
    }

    public GoofsId(int movieid, String gooftext) {
        this.movieid = movieid;
        this.gooftext = gooftext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "gooftext")
    public String getGooftext() {
        return this.gooftext;
    }

    public void setGooftext(String gooftext) {
        this.gooftext = gooftext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof GoofsId))
            return false;
        GoofsId castOther = (GoofsId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getGooftext() == castOther.getGooftext()) || (this.getGooftext() != null
                && castOther.getGooftext() != null && this.getGooftext().equals(castOther.getGooftext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getGooftext() == null ? 0 : this.getGooftext().hashCode());
        return result;
    }

}
