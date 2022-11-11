import java.util.Arrays;

public class Staff extends Person {//mentorlor
    private String scool;
    private double pay;
    private String[] students;

    public Staff(String fullName, char gender, String gmail, String scool, double pay, String[] students) {
        super(fullName, gender, gmail);
        this.scool = scool;
        this.pay = pay;
        this.students = students;
    }

    public String getScool() {
        return scool;
    }

    public void setScool(String scool) {
        this.scool = scool;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Staff"+
                "\nScool :" + scool +
                "\nPay :" + pay +
                "\nStudents Staffa :" + Arrays.toString(students)+super.toString();
    }
}