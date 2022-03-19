package hibernate;


import javax.persistence.*;

@Entity
//@Table(name = "users")
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")

    private String name;


    public users() {
        super();
    }

    public users(long id, String name) {
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