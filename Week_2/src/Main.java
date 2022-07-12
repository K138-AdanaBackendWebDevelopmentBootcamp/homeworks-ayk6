import model.Course;
import model.VisitingResearcher;
import utils.HybnernateUtil;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {

        EntityManager em = HybnernateUtil.getEntityManager();

        System.out.println("Working ...");

        Course course = new Course();
        course.setCourseName("mat");
        course.setCourseCode("m12");
        course.setCreditScore(4);
        course.setStudentList(null);
        course.setInstructor(null);

        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();

        em.clear();
        em.close();

    }
}
