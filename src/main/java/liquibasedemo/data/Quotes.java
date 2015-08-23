package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Quotes generated by hbm2java
 */
@Entity
@Table(name = "quotes", schema = "public")
public class Quotes implements java.io.Serializable {

    private QuotesId id;

    public Quotes() {
    }

    public Quotes(QuotesId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "quotetext", column = @Column(name = "quotetext"))})
    public QuotesId getId() {
        return this.id;
    }

    public void setId(QuotesId id) {
        this.id = id;
    }

}
