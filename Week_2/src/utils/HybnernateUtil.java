package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HybnernateUtil {
    static EntityManagerFactory emf = null;

    private HybnernateUtil(){}

    public static EntityManager getEntityManager(){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }

    public static void closeEM(EntityManager em){
        em.clear();
        em.close();
        emf.close();
    }
}
