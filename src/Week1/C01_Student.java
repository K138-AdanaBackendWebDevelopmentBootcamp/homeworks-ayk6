package Week1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    // A Student who has a name, a birth date, an address, and gender could
    // take zero or more courses.

    private String name;
    private Date birthDate;
    private String adress;
    private String gender;

    private List<Course> courseList = new ArrayList<>();

    public Student(String name, Date birthDate, String adress, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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
}
