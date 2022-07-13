import controller.CourseController;
import model.Course;
import model.Instructor;
import model.VisitingResearcher;
import utils.HybnernateUtil;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) {

        EntityManager em = HybnernateUtil.getEntityManager("mysqlPU");

        System.out.println("Working ...");

        Course course = new Course();
        course.setCourseName("mat");
        course.setCourseCode("m12");
        course.setCreditScore(4);
        course.setStudentList(null);
        course.setInstructor(null);

        Course course2 = new Course();
        course.setCourseName("fen");
        course.setCourseCode("f1");
        course.setCreditScore(6);
        course.setStudentList(null);
        course.setInstructor(null);

        ;
        VisitingResearcher visitingResearcher = new VisitingResearcher();
        visitingResearcher.setHourlySalary(10);
        visitingResearcher.setAdress("vrAdress");
        visitingResearcher.setName("vrName");
        visitingResearcher.setPhoneNumber("3141592");
        course2.setInstructor(visitingResearcher);

        CourseController courseController = new CourseController();
        courseController.saveCourse(course);
        courseController.saveCourse(course2);
    }
}
