package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CountriesId generated by hbm2java
 */
@Embeddable
public class CountriesId implements java.io.Serializable {

    private int movieid;
    private String country;

    public CountriesId() {
    }

    public CountriesId(int movieid, String country) {
        this.movieid = movieid;
        this.country = country;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "country", nullable = false, length = 50)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof CountriesId))
            return false;
        CountriesId castOther = (CountriesId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
                && castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
        return result;
    }

}
