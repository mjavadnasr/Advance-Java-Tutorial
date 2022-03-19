package hibernate;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")

    private String name;


    public User() {
        super();
    }

    public User(long id, String name) {
        this.id=id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }
}