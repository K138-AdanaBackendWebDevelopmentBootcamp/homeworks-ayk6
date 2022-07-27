package com.wfp.week_3.dao;

import com.wfp.week_3.model.Course;
import com.wfp.week_3.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDaoJpaImp implements CourseDAO<Course>{
    EntityManager entityManager;

    public CourseDaoJpaImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> findAll() {
        return entityManager.createNativeQuery("select * from Course").getResultList();
    }

    @Override
    public Course findById(int id) {
        return (Course) entityManager.createNativeQuery("select * from Course c WHERE c.id =:idP")
                .setParameter("idP",id).getSingleResult();
    }

    @Override
    public Course save(Course course) {
        List<Course> foundCourses = entityManager.createNativeQuery("select * from Course c WHERE c.courseCode=:CodeParam",Course.class)
                .setParameter("CodeParam",course.getCourseCode()).getResultList();
        return course;
    }

    @Override
    public void update(Course object, int id) {
    }

    @Override
    public void deleteByID(int id) {
        Object deletingCourse = entityManager.createNativeQuery("select * from Course dc WHERE dc.id=:idP",Course.class).setParameter("idP",id).getSingleResult();
        entityManager.remove(deletingCourse);
    }


    @Override
    public Course uptateByID(Course course, int id) {
        return null;
    }

    @Override
    public void update(Student student, int id) {

    }
}
