public class Person {
    private String fullName;
    private char gender;
    private String gmail;

    public Person(String fullName, char gender, String gmail) {
        this.fullName = fullName;
        this.gender = gender;
        String a = "@";
        if (gmail.contains(a)) {
            this.gmail = gmail;
        }else {
            this.gmail="You entered the wrong password or account !";
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Person" +
                "\nFullName :" + fullName +
                "\nGen :" + gender +
                "\nGmail :" + gmail;
    }
}