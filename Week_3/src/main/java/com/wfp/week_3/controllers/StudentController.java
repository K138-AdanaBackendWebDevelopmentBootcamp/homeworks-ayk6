package com.wfp.week_3.controllers;

import com.wfp.week_3.model.Student;
import com.wfp.week_3.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController implements BaseController<Student>{

    private final StudentService<Student> studentService;

    @Autowired
    public StudentController(StudentService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getByID(int id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);

    }

    @Override
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> update(Student student, int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Student> deleteById(int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @PostMapping("/students")
    public ResponseEntity<Student> post(Student object) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
