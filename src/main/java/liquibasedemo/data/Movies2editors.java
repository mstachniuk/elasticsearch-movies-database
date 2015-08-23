package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Movies2editors generated by hbm2java
 */
@Entity
@Table(name = "movies2editors", schema = "public")
public class Movies2editors implements java.io.Serializable {

    private Movies2editorsId id;

    public Movies2editors() {
    }

    public Movies2editors(Movies2editorsId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "editorid", column = @Column(name = "editorid", nullable = false)),
            @AttributeOverride(name = "addition", column = @Column(name = "addition", length = 1000))})
    public Movies2editorsId getId() {
        return this.id;
    }

    public void setId(Movies2editorsId id) {
        this.id = id;
    }

}
