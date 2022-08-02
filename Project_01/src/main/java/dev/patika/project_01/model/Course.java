package dev.patika.project_01.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Course {

    // Each course has a course name, a course code, and a credit score.
    // A course could be instructed by only one instructor.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String courseName;
    private int courseCode;
    private double creditScore;

    @ManyToMany
    private List<Student> studentList;


    public Course(String courseName, int courseCode, double creditScore) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
    }
}
