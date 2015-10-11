package liquibasedemo.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "directors", schema = "public")
public class Director implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "directorid", unique = true, nullable = false)
    private Integer directorid;

    @Column(name = "name")
    private String name;

    public Integer getDirectorid() {
        return directorid;
    }

    public void setDirectorid(Integer directorid) {
        this.directorid = directorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
