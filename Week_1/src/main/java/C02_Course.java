import java.util.List;

public class C02_Course {

    // Each course has a course name, a course code, and a credit score.
    // A course could be instructed by only one instructor.

    private String courseName;
    private int courseCode;
    private int creditScore;

    private List<C01_Student> studentList;
    //private Week1.C03_Instructor instructor;

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

    public C02_Course(String courseName, int courseCode, int creditScore, List<C01_Student> studentList) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.studentList = studentList;



    }
}
