package alexrm84.hibernate.dao;

import alexrm84.hibernate.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Component
@Transactional
public class UserDAO extends AbstractDAO {

    public void persist(User user) {
        entityManager.persist(user);
    }

    public void merge(User user) {
        entityManager.merge(user);
    }

    public User find(String id) {
        return entityManager.find(User.class, id);
    }

    public void remove(String id) {
        entityManager.remove(find(id));
    }

    public List<User> findAll() {
        return entityManager.createQuery("SELECT e FROM User e", User.class).getResultList();
    }

    public void removeAll() {
        entityManager.createQuery("DELETE FROM User e").executeUpdate();
    }
}
