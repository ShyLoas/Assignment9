package assignment9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList stl = new StudentList();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n========= MENU =========");
        System.out.println("1. Add Students");
        System.out.println("2. Display All Students");
        System.out.println("3. Find Student by ID");
        System.out.println("4. Delete Student by ID");
        System.out.println("5. Edit Student by ID");
        System.out.println("6. Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    stl.addStudent();
                    break;
                case 2:
                    stl.displayAllStudent();
                    break;
                case 3:
                    System.out.print("Enter ID to find: ");
                    String idToFind = sc.nextLine();
                    Student found = stl.findStudentById(idToFind);
                    if (found != null) {
                        found.displayStudentInfo();
                    } else {
                        System.out.println("Can't found ID");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to Delete: ");
                    String idToDelete = sc.nextLine();
                    if (stl.deleteStudentById(idToDelete)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Can't found ID");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to Edit: ");
                    String idToEdit = sc.nextLine();
                    if (stl.editStudentById(idToEdit)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Can't found ID");
                    }
                    break;
                case 6:
                    return;
            }
        }
    }
}
