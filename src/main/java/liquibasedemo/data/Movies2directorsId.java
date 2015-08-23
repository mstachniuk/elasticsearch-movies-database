package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Movies2directorsId generated by hbm2java
 */
@Embeddable
public class Movies2directorsId implements java.io.Serializable {

    private int movieid;
    private int directorid;
    private String addition;

    public Movies2directorsId() {
    }

    public Movies2directorsId(int movieid, int directorid) {
        this.movieid = movieid;
        this.directorid = directorid;
    }

    public Movies2directorsId(int movieid, int directorid, String addition) {
        this.movieid = movieid;
        this.directorid = directorid;
        this.addition = addition;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "directorid", nullable = false)
    public int getDirectorid() {
        return this.directorid;
    }

    public void setDirectorid(int directorid) {
        this.directorid = directorid;
    }

    @Column(name = "addition", length = 1000)
    public String getAddition() {
        return this.addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof Movies2directorsId))
            return false;
        Movies2directorsId castOther = (Movies2directorsId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && (this.getDirectorid() == castOther.getDirectorid())
                && ((this.getAddition() == castOther.getAddition()) || (this.getAddition() != null
                && castOther.getAddition() != null && this.getAddition().equals(castOther.getAddition())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + this.getDirectorid();
        result = 37 * result + (getAddition() == null ? 0 : this.getAddition().hashCode());
        return result;
    }

}
