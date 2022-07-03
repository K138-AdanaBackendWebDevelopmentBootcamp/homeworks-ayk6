package classes.course;

import classes.instructor.Instructor;
import classes.student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Course {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    // Each course has a course name, a course code, and a credit score.
    // A course could be instructed by only one instructor.

    private String courseName;
    private int courseCode;
    private int creditScore;

    @OneToMany(mappedBy = "course")
    private List<Student> studentList;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public Course(String courseName, int courseCode, int creditScore, List<Student> studentList, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.studentList = studentList;


    }
}
