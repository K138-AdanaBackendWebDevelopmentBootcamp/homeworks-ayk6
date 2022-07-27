package com.wfp.week_3.controllers;


import org.springframework.http.ResponseEntity;


import java.util.List;

public interface BaseController<T>{
    ResponseEntity<List<T>> getAll();
    ResponseEntity<T> getByID(int id);

    ResponseEntity<T> update(T t,int id);

    ResponseEntity<T> deleteById(int id);
    ResponseEntity<T> post(T object);
}
