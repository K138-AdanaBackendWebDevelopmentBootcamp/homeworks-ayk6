package com.wfp.week_3.dao;

import com.wfp.week_3.model.Student;

public interface CourseDAO<Course> extends BaseDAO<Course> {
    void deleteByID(int id);
    Course uptateByID(Course course, int id);

    void update(Student student, int id);
}
