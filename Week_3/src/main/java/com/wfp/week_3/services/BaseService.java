package com.wfp.week_3.services;

import com.wfp.week_3.model.Student;

import java.util.List;

public interface BaseService <T>{
    List<T> findAll();

    T findById(int id);

    T save(T object);

    void deleteById(int id);

    void update(Student course, int id);
}
