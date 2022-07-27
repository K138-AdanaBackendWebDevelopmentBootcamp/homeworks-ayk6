package com.wfp.week_3.dao;

public interface CourseDAO<Course> extends BaseDAO<Course> {
    void deleteByID(int id);
    Course uptateByID(Course course, int id);
}
