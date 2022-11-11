import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Baiysh", 'M', "baiysh.zmb@gmail.com", "devoloper java", 2000, 24000);
        System.out.println(student);
        System.out.println();
        Student student2 = new Student("Baytik", 'M', "baiysh.zmb@gmail.com", "devoloper java", 2002, 36000);
        System.out.println(student2);

        System.out.println();

        Staff staff = new Staff("Muhammed Toichubay uulu", 'M', "Muhammed@mail.com", "Peaksoft", 12000, new String[]{"Baiysh,Baytik"});
        Staff staff2 = new Staff("Rahim Bazarbay uulu", 'M', "Rahim@mail.com", "Peaksoft", 12000, new String[]{"Baiysh,Baytik"});
        System.out.println(staff);
        System.out.println();
        System.out.println(staff2);
        System.out.println();
        System.out.println("   'studentter kancha ay okuy alyshat '   ");
        while (true) {
            int a = (int) student.getFee();
            int b = (int) student2.getFee();
            if (a > staff.getPay()) {
                System.out.println("student " + student.getFullName() + " " + a / staff.getPay() + " ay okuy alat");
                System.out.println("student " + student2.getFullName() + " " + b / staff.getPay() + " ay okuy alat");
                break;
            }


        }

    }
}