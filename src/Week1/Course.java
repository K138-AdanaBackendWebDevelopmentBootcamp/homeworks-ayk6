package Week1;

import java.util.List;

public class Course {

    // Each course has a course name, a course code, and a credit score.
    // A course could be instructed by only one instructor.

    private String courseName;
    private int courseCode;
    private int creditScore;

    private List<Student> studentList;
    private Instructor instructor;

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
        this.instructor = instructor;


    }
}
