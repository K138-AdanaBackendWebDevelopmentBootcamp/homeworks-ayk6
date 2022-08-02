package dev.patika.project_01.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Instructors who have a name, an address and a phone number could
    // instruct at least one or more courses.
    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.

    private Long id;
    private String name;
    private String adress;
    private String phoneNumber;
    private Long salary;

    @OneToMany
    private List<Course> courseList;

    public Instructor(String name, String adress, String phoneNumber, Long salary) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
}