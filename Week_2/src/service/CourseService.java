package service;

import model.Course;
import model.Instructor;
import model.Student;
import repositories.CourseRepository;
import repositories.CrudRepo;
import utils.HybnernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseService implements CrudRepo<Course>, CourseRepository {

    EntityManager em = HybnernateUtil.buildSessionFactory();
    @Override
    public List<Course> listAll() {
        em.getTransaction().begin();
        List<Course> courseList = em.createNativeQuery("select * from Course").getResultList();
        return courseList;
    }

    @Override
    public Course findById(int id) {
        em.getTransaction().begin();
        Course course = em.find(Course.class,id);
        return null;
    }


    @Override
    public void saveToDatabase(Course course) {
        try {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            em.getTransaction().rollback();
        }finally {
          // HybnernateUtil.getEntityManager(em);
        }
    }

    @Override
    public void updateDatabase(Course course, int id) {
        try {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteFromDatabase(Course course, int id) {
        try {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteByCourseId(int id) {
        try {
            em.getTransaction().begin();
            Course course = findById(id);
            em.remove(course);
            em.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            em.getTransaction().rollback();
        }
    }

    @Override
    public Instructor getInstructor(Course course) {
        try {
            em.getTransaction().begin();
            Course foundCourse = em.find(Course.class,getCourseId());
            return foundCourse.getInstructor();
        }catch (Exception e){
            e.getMessage();
            em.getTransaction().rollback();
        }finally {
            // HybnernateUtil.getEntityManager(em);
        }
        return null;
    }


    @Override
    public List<Student> getStudentList(Course course) {
        try {
            em.getTransaction().begin();
            Course foundCourse = em.find(Course.class,getCourseId());
            return foundCourse.getStudentList();
        }catch (Exception e){}
        return null;
    }


    private Object getCourseId() {
        return null;
    }
}

