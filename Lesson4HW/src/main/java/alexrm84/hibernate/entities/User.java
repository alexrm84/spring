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

    public User() {
    }

    public User(String id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

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

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
