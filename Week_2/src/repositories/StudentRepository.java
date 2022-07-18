package repositories;

import model.Course;
import model.Student;

import java.util.List;

public interface StudentRepository {
    void deleteStudentByName(String name);
    List<Course> getStudentCourseList(Student student);
}
