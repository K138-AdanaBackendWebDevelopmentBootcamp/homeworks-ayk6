package dev.patika.project_01.controller;

import dev.patika.project_01.model.Student;
import dev.patika.project_01.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.findById(id);
    }

   @PostMapping("/students")
   public ResponseEntity<Student> saveStudent(@RequestBody Student student){
       return new ResponseEntity<>((Student) studentService.save(student), HttpStatus.OK);
   }

   @PutMapping ("/students")
   public ResponseEntity<Student> updateStudent(@RequestBody Student student){
       return new ResponseEntity<>(studentService.update(student), HttpStatus.OK);
   }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable Long id){
        studentService.deleteById(id);
        return "Deleted successfully";
    }
    @DeleteMapping("/students/{name}")
    public String deleteStudentByName(@PathVariable String name) {
        studentService.deleteByName(name);
        return "Deleted...";
    }
}
