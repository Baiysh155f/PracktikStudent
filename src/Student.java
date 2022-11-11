public class Student extends Person {
    private String programmer;
    private int year;
    private int fee;


    public Student(String fullName, char gender, String gmail, String programmer, int year, int fee) {
        super(fullName, gender, gmail);
        this.programmer = programmer;
        this.year = year;
        this.fee = fee;


    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    @Override
    public String toString() {
        return "Student" +
                "\nProgrammer :" + programmer +
                "\nYear :" + year +
                "\nFee :" + fee + super.toString();
    }
}