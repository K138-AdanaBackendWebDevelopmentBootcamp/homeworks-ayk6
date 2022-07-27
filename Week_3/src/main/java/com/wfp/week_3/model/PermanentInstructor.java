package com.wfp.week_3.model;

import javax.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor {


    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A permanent instructor takes a fixed salary.

    private int fixedSalary;

    public PermanentInstructor(String name, String adress, String phoneNumber, int fixedSalary) {
        super(name, adress, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor() {

    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
