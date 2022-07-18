package controller;

import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentService();

    public List<Student> findAllStudents(){
        return studentService.findAll();
    }
    public Student findStudentById(int id){
        return studentService.findById(id);
    }
    public void saveStudent(Student student){
        studentService.saveToDatabase(student);
    }
    public void deleteStudent(Student t,int id){
        studentService.deleteFromDatabase(t,id);
    }
    public void updateStudent(Student student, int id){
        studentService.updateDatabase(student,id);
    }



}
