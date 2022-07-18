package repositories;

import model.Course;
import model.Instructor;

import java.util.List;

public interface InstructorRepository {
    void deleteInstructorByName(String name);
    List<Course> getInstructorCourseList(Instructor instructor);
}
