package com.wfp.week_3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {

    @Id
    @GeneratedValue(generator = "instructor",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "instructor",sequenceName = "INSTRUCTOR_SEQ_ID")

    // Instructors who have a name, an address and a phone number could
    // instruct at least one or more courses.
    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.

    private String name;
    private String adress;
    private String phoneNumber;

    @OneToMany
    private List<Course> courseList = new ArrayList<>();
    private Long id;

    public Instructor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Instructor(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
