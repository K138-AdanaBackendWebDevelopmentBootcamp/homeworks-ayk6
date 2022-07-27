package com.wfp.week_3.dao;

import com.wfp.week_3.model.Course;

import java.util.List;

public interface BaseDAO <T>{
    List<T> findAll();
    T findById(int id);
    Course save(T object);
    void update(Course object, int id);
    void deleteByID(int id);
}
