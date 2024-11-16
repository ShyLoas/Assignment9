package assignment9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String id;
    String fullName;
    String major;
    float gpa;
    Date dateOfBirth;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    Student(String id, String fullName, Date dateOfBirth, String major, float gpa) {
        this.id = id;
        this.fullName = fullName;
        this.major = major;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    Student() {
    }

    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter FullName: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter date of Birth: ");
        try {
            this.dateOfBirth = df.parse(sc.nextLine());
        } catch (ParseException e) {
        }
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent ID: " + this.id);
        System.out.println("FullName: " + this.fullName);
        System.out.println("Date of Birth: " + df.format(this.dateOfBirth));
        System.out.println("Major: " + this.major);
        System.out.println("GPA: " + this.gpa);
    }

    public String getStudentID() {
        return id;
    }
}
