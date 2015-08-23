package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PlotsId generated by hbm2java
 */
@Embeddable
public class PlotsId implements java.io.Serializable {

    private int movieid;
    private String plottext;

    public PlotsId() {
    }

    public PlotsId(int movieid) {
        this.movieid = movieid;
    }

    public PlotsId(int movieid, String plottext) {
        this.movieid = movieid;
        this.plottext = plottext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "plottext")
    public String getPlottext() {
        return this.plottext;
    }

    public void setPlottext(String plottext) {
        this.plottext = plottext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof PlotsId))
            return false;
        PlotsId castOther = (PlotsId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getPlottext() == castOther.getPlottext()) || (this.getPlottext() != null
                && castOther.getPlottext() != null && this.getPlottext().equals(castOther.getPlottext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getPlottext() == null ? 0 : this.getPlottext().hashCode());
        return result;
    }

}