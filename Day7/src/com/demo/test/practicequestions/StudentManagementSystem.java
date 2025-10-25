package com.demo.test.practicequestions;

import java.util.Scanner;
import com.demo.service.practicequestions.StudentService;
import com.demo.service.practicequestions.StudentServiceImpl;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl service = new StudentServiceImpl();
        int choice;
        do {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students ");
            System.out.println("3. Serialize Students");
            System.out.println("4. Deserialize and Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	service.addNewStudent();
                    break;
                case 2:
                	 service.displayAllStudents();
                    break;
                case 3:
                    service.serializeStudents();
                    break;
                case 4:
                    service.deserializeAndDisplayStudents();
                    break;
                case 5:
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
