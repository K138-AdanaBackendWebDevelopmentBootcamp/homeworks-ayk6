package controller;

import model.Course;
import model.Instructor;
import model.Student;
import service.CourseService;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseService();

    public List<Course> listAllCourse(){
        return courseService.listAll2();
    }
    public Course findById(int id){
        return courseService.findById(id);
    }
    public void saveCourse(Course course){
       courseService.saveToDatabase(course);
    }
    public void updateCourse(Course course, int id){
        courseService.updateDatabase(course,id);
    }
    public void deleteCourseId(Course course, int id){
        courseService.deleteFromDatabase(course, id);
    }
    public void deleteCourseById(int id){
        courseService.deleteByCourseId(id);
    }
    public Instructor getCourseInstructor(Course course){
        return courseService.getInstructor(course);
    }
    public List<Student> getCourseStudentList(Course course){
        return  courseService.getStudentList(course);
    }
}
