package com.wfp.week_3.controllers;

import com.wfp.week_3.model.Instructor;
import com.wfp.week_3.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor/{c}")
public class InstructorController implements BaseController<Instructor>{
    private final InstructorService<Instructor> instructorService;

    @Autowired
    public InstructorController(InstructorService<Instructor> instructorService) {
        this.instructorService = instructorService;
    }

    @Override
    @GetMapping("/instructor")
    public ResponseEntity<List<Instructor>> getAll() {
        return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/instructor/{id}")
    public ResponseEntity<Instructor> getByID(int id) {
        return new ResponseEntity<>(instructorService.findById(id),HttpStatus.OK);
    }

    @Override
    @PutMapping("/instructor/{id}")
    public ResponseEntity<Instructor> update(Instructor instructor, int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/instructor/{id}")
    public ResponseEntity<Instructor> deleteById(int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @PostMapping("/instructor")
    public ResponseEntity<Instructor> post(Instructor instructor) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
