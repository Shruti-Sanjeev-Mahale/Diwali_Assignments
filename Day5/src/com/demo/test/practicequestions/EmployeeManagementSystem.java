package com.demo.test.practicequestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.practicequestions.Employee;
import com.demo.service.practicequestions.EmployeeService;
import com.demo.service.practicequestions.EmployeeServiceImpl;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	EmployeeService eservice=new EmployeeServiceImpl();
		int choice = 0;


        do {
            System.out.println("\n=== Employee Management ===");
            System.out.println("1. Add Employee to list");
            System.out.println("2. Remove Employee from list");
            System.out.println("3. Show all Employees");
            System.out.println("4. Show all Employees in sorted order (by empID)");
            System.out.println("5. Find an Employee by empName");
            System.out.println("6. Save all Employees into file");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
           

            switch (choice) {
                case 1->{
                	boolean status=eservice.addNewEmployee();
    				if(status) {
    					System.out.println("added successfully!");
    				}else {
    					System.out.println("not found");
    				}
                	
                }
                case 2->{
                	System.out.println("enter id for delete");
    				int eid=sc.nextInt();
    				boolean status=eservice.deleteById(eid);
    				if(status) {
    					System.out.println("delete succesfully");		
    				}
    			else {
    				 System.out.println("not found");
    			}
  	
                }
                case 3->{
                	List<Employee> elist=eservice.displayAll();
    				elist.forEach(System.out::println);

                }
                case 4->{
                	List<Employee> elst=eservice.sortById();
    				elst.forEach(System.out::println);

                	
                }
                case 5->{
                	System.out.println("Enter name for search");
    				String nm=sc.next();
    				List<Employee> elst=eservice.findByName(nm);
    				if(elst!=null) {
    					elst.forEach(System.out::println);
    				}else {
    					System.out.println("Not Found");
    				}

                }
                case 6->{
                	eservice.saveAllEmployeesToFile();
                }
                 
                case 7->{
                	System.out.println("Thankyou for visiting ...");

                    break;
                }
                default-> {
                    System.out.println("Invalid option, try again.");
                    break;
                }
            }

        } while (choice != 7);

        sc.close();
    }
}
