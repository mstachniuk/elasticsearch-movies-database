package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Writers generated by hbm2java
 */
@Entity
@Table(name = "writers", schema = "public")
public class Writers implements java.io.Serializable {

    private int writerid;
    private String name;

    public Writers() {
    }

    public Writers(int writerid, String name) {
        this.writerid = writerid;
        this.name = name;
    }

    @Id
    @Column(name = "writerid", unique = true, nullable = false)
    public int getWriterid() {
        return this.writerid;
    }

    public void setWriterid(int writerid) {
        this.writerid = writerid;
    }

    @Column(name = "name", nullable = false, length = 250)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
