package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HybnernateUtil {
    static EntityManagerFactory emf = null;

    private HybnernateUtil(){}

    public static EntityManager buildSessionFactory(){
        return null;
    };
    public static EntityManager getEntityManager(String persistenceUnitName){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }

    public static void closeEM(EntityManager em){
        em.clear();
        em.close();
        emf.close();
    }
}
