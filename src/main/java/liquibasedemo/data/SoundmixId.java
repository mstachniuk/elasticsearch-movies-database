package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SoundmixId generated by hbm2java
 */
@Embeddable
public class SoundmixId implements java.io.Serializable {

    private int movieid;
    private String sound;
    private String addition;

    public SoundmixId() {
    }

    public SoundmixId(int movieid, String sound) {
        this.movieid = movieid;
        this.sound = sound;
    }

    public SoundmixId(int movieid, String sound, String addition) {
        this.movieid = movieid;
        this.sound = sound;
        this.addition = addition;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "sound", nullable = false)
    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Column(name = "addition")
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
        if (!(other instanceof SoundmixId))
            return false;
        SoundmixId castOther = (SoundmixId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getSound() == castOther.getSound()) || (this.getSound() != null
                && castOther.getSound() != null && this.getSound().equals(castOther.getSound())))
                && ((this.getAddition() == castOther.getAddition()) || (this.getAddition() != null
                && castOther.getAddition() != null && this.getAddition().equals(castOther.getAddition())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getSound() == null ? 0 : this.getSound().hashCode());
        result = 37 * result + (getAddition() == null ? 0 : this.getAddition().hashCode());
        return result;
    }

}
