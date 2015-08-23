package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CrazycreditsId generated by hbm2java
 */
@Embeddable
public class CrazycreditsId implements java.io.Serializable {

    private int movieid;
    private String credittext;

    public CrazycreditsId() {
    }

    public CrazycreditsId(int movieid) {
        this.movieid = movieid;
    }

    public CrazycreditsId(int movieid, String credittext) {
        this.movieid = movieid;
        this.credittext = credittext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "credittext")
    public String getCredittext() {
        return this.credittext;
    }

    public void setCredittext(String credittext) {
        this.credittext = credittext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof CrazycreditsId))
            return false;
        CrazycreditsId castOther = (CrazycreditsId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getCredittext() == castOther.getCredittext()) || (this.getCredittext() != null
                && castOther.getCredittext() != null && this.getCredittext().equals(castOther.getCredittext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getCredittext() == null ? 0 : this.getCredittext().hashCode());
        return result;
    }

}