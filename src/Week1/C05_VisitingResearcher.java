package Week1;

public class visitingResearcher extends Instructor{

    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A visiting researcher takes an hourly salary

    private int hourlySalary;

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public visitingResearcher(String name, String adress, String phoneNumber, int hourlySalary) {
        super(name, adress, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public visitingResearcher(String name, String adress, String phoneNumber) {
        super(name, adress, phoneNumber);
    }
}
