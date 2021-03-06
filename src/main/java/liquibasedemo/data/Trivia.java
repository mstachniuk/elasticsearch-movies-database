package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Trivia generated by hbm2java
 */
@Entity
@Table(name = "trivia", schema = "public")
public class Trivia implements java.io.Serializable {

    private TriviaId id;

    public Trivia() {
    }

    public Trivia(TriviaId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "triviatext", column = @Column(name = "triviatext"))})
    public TriviaId getId() {
        return this.id;
    }

    public void setId(TriviaId id) {
        this.id = id;
    }

}
