package dev.patika.project_01.controller;

import dev.patika.project_01.model.Course;
import dev.patika.project_01.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    CourseServiceImpl courseService;

    @Autowired
    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    public Course getCoursesById(@PathVariable Long id){
        return courseService.findById(id);
    }

    @PostMapping("/courses")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>((Course) courseService.save(course), HttpStatus.OK);
    }

    @PutMapping ("/courses")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.update(course), HttpStatus.OK);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourseById(@PathVariable Long id){
        courseService.deleteById(id);
        return "Deleted successfully";
    }
    @DeleteMapping("/courses/{name}")
    public String deleteCourseByName(@PathVariable String courseName) {
        courseService.deleteByName(courseName);
        return "Deleted...";
    }
}
