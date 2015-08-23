package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Goofs generated by hbm2java
 */
@Entity
@Table(name = "goofs", schema = "public")
public class Goofs implements java.io.Serializable {

    private GoofsId id;

    public Goofs() {
    }

    public Goofs(GoofsId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "gooftext", column = @Column(name = "gooftext"))})
    public GoofsId getId() {
        return this.id;
    }

    public void setId(GoofsId id) {
        this.id = id;
    }

}
