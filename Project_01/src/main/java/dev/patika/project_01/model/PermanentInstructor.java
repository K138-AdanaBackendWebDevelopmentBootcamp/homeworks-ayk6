package dev.patika.project_01.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class PermanentInstructor extends Instructor {

    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A permanent instructor takes a fixed salary.

    private Long fixedSalary;

    public PermanentInstructor(String name, String adress, String phoneNumber, Long salary) {
        super(name, adress, phoneNumber, salary);
        salary = fixedSalary;
    }
}
