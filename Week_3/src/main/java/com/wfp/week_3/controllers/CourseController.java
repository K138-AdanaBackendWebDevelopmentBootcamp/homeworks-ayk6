package com.wfp.week_3.controllers;


import com.wfp.week_3.model.Course;
import com.wfp.week_3.services.BaseService;
import com.wfp.week_3.services.CourseService;
import com.wfp.week_3.services.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController implements BaseController<Course> {


    CourseService<Course> courseService;

    @Autowired
    public CourseController(CourseService<Course> courseService) {

        this.courseService = courseService;
    }

    @Override
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAll() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getByID(int id) {
        return new ResponseEntity<>(courseService.findById(id), HttpStatus.OK);
    }

    @Override
    @PutMapping("/courses/{id}")
    public ResponseEntity<Course> update(@RequestBody Course course, @PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/courses/{id}")
    public ResponseEntity<Course> deleteById(int id) {
        courseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @PostMapping("/courses")
    public ResponseEntity<Course> post(Course course) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
