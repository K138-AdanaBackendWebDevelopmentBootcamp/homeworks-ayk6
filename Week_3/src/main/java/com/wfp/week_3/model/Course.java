package com.wfp.week_3.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Course extends Instructor {

    @Id
    @GeneratedValue(generator = "course", strategy = GenerationType.SEQUENCE)

    // Each course has a course name, a course code, and a credit score.
    // A course could be instructed by only one instructor.

    private String courseName;
    private String courseCode;
    private int creditScore;

    @ManyToOne
    private Instructor instructor;

    @ManyToMany
    private List<Student> studentList = new ArrayList<>();

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String courseName, String courseCode, int creditScore, List<Student> studentList, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.studentList = studentList;
    }
}
