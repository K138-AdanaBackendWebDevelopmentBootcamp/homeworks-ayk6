package com.wfp.week_3.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(generator = "student" ,strategy = GenerationType.SEQUENCE)

    // A Student who has a name, a birth date, an address, and gender could
    // take zero or more courses.

    private String name;
    private int birthDate;
    private String adress;
    private String gender;

    @ManyToMany
    private List<Course> courseList = new ArrayList<>();
    private Long id;

    public Student(String name, int birthDate, String adress, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.gender = gender;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getStudentCourses() {
        return getStudentCourses();
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
