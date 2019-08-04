package alexrm84.hibernate;

import alexrm84.hibernate.config.AppConfig;
import alexrm84.hibernate.dao.UserDAO;
import alexrm84.hibernate.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.applet.AppletContext;

public class MainAppHibernate {

//    private static final EntityManagerFactory factory;
//
//    static {
//        final String pu = "ENTERPRISE";
//        factory = Persistence.createEntityManagerFactory(pu);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("12123");
//        final EntityManager em = factory.createEntityManager();
//        em.close();
//    }


    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        final UserDAO userDAO = context.getBean(UserDAO.class);
//        final User user = new User();
//        user.setId("1");
//        user.setLogin("user");
//        user.setPassword("pass");
//        userDAO.persist(user);


    }
}
