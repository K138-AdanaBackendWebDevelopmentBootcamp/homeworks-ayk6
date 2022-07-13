package model;



import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class VisitingResearcher extends Instructor {

    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A visiting researcher takes an hourly salary


    private int hourlySalary;

    public VisitingResearcher() {
        super();
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String name, String adress, String phoneNumber, int hourlySalary) {
        super(name, adress, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String name, String adress, String phoneNumber) {
        super(name, adress, phoneNumber);
    }

    public void setCourseList(int i) {
    }
}
