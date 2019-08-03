package alexrm84.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainAppHibernate {

    private static final EntityManagerFactory factory;

    static {
        final String pu = "ENTERPRISE";
        factory = Persistence.createEntityManagerFactory(pu);
    }

    public static void main(String[] args) {
        System.out.println("12123");
        final EntityManager em = factory.createEntityManager();
        em.close();
    }
}
