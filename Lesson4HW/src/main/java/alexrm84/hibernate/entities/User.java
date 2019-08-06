package alexrm84.hibernate.entities;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private String id;
    private String login;
    private String password;

    @OneToOne
    @JoinColumn(name = "task_id")
    private Task task;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
