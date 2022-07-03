package classes.instructor;

import classes.course.Course;
import classes.student.Student;
import classes.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TestInstructor {

    public static void main(String[] args) {

        saveTestData();

    }

    private static void saveTestData() {
        Instructor inst1 = new Instructor("Saldıray","ist","1234");
        VisitingResearcher vr1 = new VisitingResearcher("vedat","ank","246");
        PermanentInstructor pr1 = new PermanentInstructor("bülent","adana","1396");

        Student student1 = new Student("ali",2000,"ist","m");
        Student student2 = new Student("veli",2001,"ank","m");
        List <Student> stdList = new ArrayList<>();
        stdList.add(student1);
        stdList.add(student2);


        Course course1 = new Course("mat",1,4,stdList,inst1);
        Course course2 = new Course("trc",2,6,stdList,vr1);
        Course course3 = new Course("fen",3,8,stdList,pr1);

        course1.setCourseCode(4);
        course2.setCourseName("cName");
        course3.setCreditScore(6);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");


        try {
            em.getTransaction().begin();

            em.persist(inst1);
            em.persist(vr1);
            em.persist(pr1);

            em.persist(student1);
            em.persist(student2);
            em.persist(stdList);

            em.persist(course1);
            em.persist(course2);
            em.persist(course3);

            em.getTransaction().commit();

            System.out.println("all data persisted");

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEM(em);
        }


    }
}
