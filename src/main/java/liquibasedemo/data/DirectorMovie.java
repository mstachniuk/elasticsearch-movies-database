package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Directors generated by hbm2java
 */
@Entity
@Table(name = "movies2directors", schema = "public")
public class DirectorMovie implements java.io.Serializable {

    @EmbeddedId
    private DirectorId directorid;

    @Column(name = "addition")
    private String addition;

    public DirectorMovie() {
    }

    public DirectorId getDirectorid() {
        return directorid;
    }

    public void setDirectorid(DirectorId directorid) {
        this.directorid = directorid;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }
}
