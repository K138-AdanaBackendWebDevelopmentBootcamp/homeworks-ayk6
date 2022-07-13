public class C03_Instructor {

    // Instructors who have a name, an address and a phone number could
    // instruct at least one or more courses.
    // There are 2 types of instructors; “visiting researcher” or “permanent
    // instructor”.

    private String name;
    private String adress;
    private String phoneNumber;

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

    public C03_Instructor(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }
}
