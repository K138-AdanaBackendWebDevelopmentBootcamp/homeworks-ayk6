package dev.patika.project_01.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class VisitingResearcher extends Instructor {

    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A visiting researcher takes an hourly salary

    private Long hourlySalary;

    public VisitingResearcher(String name, String adress, String phoneNumber, Long salary) {
        super(name, adress, phoneNumber,salary);
        salary= hourlySalary;
    }
}
