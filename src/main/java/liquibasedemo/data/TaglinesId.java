package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TaglinesId generated by hbm2java
 */
@Embeddable
public class TaglinesId implements java.io.Serializable {

    private int movieid;
    private String taglinetext;

    public TaglinesId() {
    }

    public TaglinesId(int movieid) {
        this.movieid = movieid;
    }

    public TaglinesId(int movieid, String taglinetext) {
        this.movieid = movieid;
        this.taglinetext = taglinetext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "taglinetext")
    public String getTaglinetext() {
        return this.taglinetext;
    }

    public void setTaglinetext(String taglinetext) {
        this.taglinetext = taglinetext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TaglinesId))
            return false;
        TaglinesId castOther = (TaglinesId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getTaglinetext() == castOther.getTaglinetext()) || (this.getTaglinetext() != null
                && castOther.getTaglinetext() != null && this
                .getTaglinetext()
                .equals(castOther.getTaglinetext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getTaglinetext() == null ? 0 : this.getTaglinetext().hashCode());
        return result;
    }

}