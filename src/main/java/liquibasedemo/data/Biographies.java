package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Biographies generated by hbm2java
 */
@Entity
@Table(name = "biographies", schema = "public")
public class Biographies implements java.io.Serializable {

    private int bioid;
    private String name;
    private String biotext;

    public Biographies() {
    }

    public Biographies(int bioid, String name) {
        this.bioid = bioid;
        this.name = name;
    }

    public Biographies(int bioid, String name, String biotext) {
        this.bioid = bioid;
        this.name = name;
        this.biotext = biotext;
    }

    @Id
    @Column(name = "bioid", unique = true, nullable = false)
    public int getBioid() {
        return this.bioid;
    }

    public void setBioid(int bioid) {
        this.bioid = bioid;
    }

    @Column(name = "name", nullable = false, length = 250)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "biotext")
    public String getBiotext() {
        return this.biotext;
    }

    public void setBiotext(String biotext) {
        this.biotext = biotext;
    }

}
