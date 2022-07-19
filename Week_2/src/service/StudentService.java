package service;

import model.Course;
import model.Student;
import repositories.CrudRepo;
import repositories.StudentRepository;
import utils.HybnernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentService implements CrudRepo<Student>, StudentRepository {

    EntityManager em = HybnernateUtil.buildSessionFactory();

    public List<Student> findAll() {
        return null;
    }


    @Override
    public List<Course> listAll() {
        /*List<Student> studentList = em.createQuery("from Student ", Student.class).getResultList();
        em.close();
        return studentList;*/
        return null;
    }

    @Override
    public Student findById(int id) {
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    @Override
    public void saveToDatabase(Student student) {
        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            em.close();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
    }

    @Override
    public void updateDatabase(Student student, int id) {
        try {
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
            em.close();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteFromDatabase(Student student, int id) {
        try {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
            em.close();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
    }

    public void deleteStudentByName(String name, Student student) {
        try {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
            System.out.println("Succesfully Deleted");
            em.close();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteStudentByName(String name) {

    }

    @Override
    public List<Course> getStudentCourseList(Student student) {
        Student foundStudent = em.find(Student.class,student.getName());
        em.close();
        return foundStudent.getStudentCourses();
    }
}
