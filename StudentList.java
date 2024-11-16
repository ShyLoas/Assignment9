package assignment9;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentList {

    public ArrayList<Student> stl;

    public StudentList() {
        this.stl = new ArrayList<>();
    }

    public void addStudent() {
        System.out.println("Enter Number of Student: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\n=====Enter Student " + (i+1) + "=====");
            Student st = new Student();
            st.enterStudentInfo();
            stl.add(st);
        }
    }
    
    public void displayAllStudent(){
        for(Student st : stl){
            System.out.println("\n===========");
            st.displayStudentInfo();
        }
    }
    
    public Student findStudentById(String idToFind){
        for(Student st : stl){
            if(st.getStudentID().equals(idToFind)){
                return st;
            }
        }
        return null;
    }
    
    public boolean deleteStudentById(String idToDelete){
        Student st = findStudentById(idToDelete);
        if(st != null){
            stl.remove(st);
            return true;
        }
        return false;
    }
    
    public boolean editStudentById(String idToEdit){
        Student st = findStudentById(idToEdit);
        if(st != null){
            System.out.println("Enter New Information: ");
            st.enterStudentInfo();
            return true;
        }
        return false;
    }
}
