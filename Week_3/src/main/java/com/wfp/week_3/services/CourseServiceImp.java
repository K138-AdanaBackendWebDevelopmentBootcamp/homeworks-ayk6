package com.wfp.week_3.services;

import com.wfp.week_3.dao.CourseDAO;
import com.wfp.week_3.model.Course;
import com.wfp.week_3.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService<Course>{

    CourseDAO<Course> courseDAO;

    public CourseServiceImp(CourseDAO<Course> courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAO.findById(id);
    }

    @Override
    public Course save(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAO.deleteByID(id);
    }

    @Override
    public void update(Student student, int id) {
        courseDAO.update(student,id);
    }

    @Override
    public void update(Course course, int id) {
       courseDAO.update(course,id);
    }
}

