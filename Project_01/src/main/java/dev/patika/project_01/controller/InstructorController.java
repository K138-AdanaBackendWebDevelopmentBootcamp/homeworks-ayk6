package dev.patika.project_01.controller;

import dev.patika.project_01.model.Instructor;
import dev.patika.project_01.model.Student;
import dev.patika.project_01.service.InstructorServiceImpl;
import dev.patika.project_01.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class InstructorController {

    InstructorServiceImpl instructorService;

    @Autowired
    public InstructorController(InstructorServiceImpl instructorService) {
        this.instructorService= instructorService;
    }

    @GetMapping("/instructors")
    public ResponseEntity<List<Instructor>> getAllIntructors(){
        return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/instructors/{id}")
    public Instructor getInstructorById(@PathVariable Long id){
        return instructorService.findById(id);
    }

    @PostMapping("/instructors")
    public ResponseEntity<Instructor> saveInstructor(@RequestBody Instructor instructor){
        return new ResponseEntity<>((Instructor) instructorService.save(instructor), HttpStatus.OK);
    }

    @PutMapping ("/instructors")
    public ResponseEntity<Instructor> updateInstructor(@RequestBody Instructor instructor){
        return new ResponseEntity<>(instructorService.update(instructor), HttpStatus.OK);
    }

    @DeleteMapping("/instructors/{id}")
    public String deleteInstructorById(@PathVariable Long id){
        instructorService.deleteById(id);
        return "Deleted successfully";
    }
    @DeleteMapping("/instructor/{name}")
    public String deleteInstructorByName(@PathVariable String name) {
        instructorService.deleteByName(name);
        return "Deleted...";
    }
    @GetMapping("/instructor/{salary}")
    public ResponseEntity<List<Instructor>> getTop3PaidInstructor(Long salary){
        return new ResponseEntity<>(instructorService.findTop3BySalary(salary), HttpStatus.OK);
    }

    @GetMapping("/instructor/{salary}")
    public ResponseEntity<List<Instructor>> getBot3PaidInstructor(Long salary){
        return new ResponseEntity<>(instructorService.findBot3BySalary(salary), HttpStatus.OK);
    }
}
