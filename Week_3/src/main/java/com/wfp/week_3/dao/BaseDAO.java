package com.wfp.week_3.dao;

import com.wfp.week_3.model.Course;
import com.wfp.week_3.model.Student;

import java.util.List;

public interface BaseDAO <T>{
    List<T> findAll();
    T findById(int id);
    Course save(T object);
    void update(Student object, int id);
    void deleteByID(int id);
}
