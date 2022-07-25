public class C04_PermanentInstructor extends C03_Instructor {

    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.
    // A permanent instructor takes a fixed salary.

    private int fixedSalary;

    public C04_PermanentInstructor(String name, String adress, String phoneNumber, int fixedSalary) {
        super(name, adress, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public C04_PermanentInstructor(String name, String adress, String phoneNumber) {
        super(name, adress, phoneNumber);
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
