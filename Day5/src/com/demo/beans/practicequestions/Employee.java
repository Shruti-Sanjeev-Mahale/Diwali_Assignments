//Write a Employee class with following properties:                         )
//- Member variables
//	o String empName
//	o int empID
//	o String empRole
//- Overloaded constructors
//	o No arguments constructor
//	o Constructor that accepts empId and empName (empRole is hardcoded)
//	o Constructor that accepts empID, empName and empRole
//- Override toString
//- Other methods of own choice
//
//Write a menu driven program to demonstrate following operations using ArrayList of "Employee":
//1. Add Employee to list
//2. Remove Employee list
//3. Show all Employee
//4. Show all Employee in sorted order (sort on the basis of empID)
//5. Find a Employee with empName
//6. Save all Employees into file
//7. Quit

package com.demo.beans.practicequestions;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable{
    private String empName;
    private int empID;
    private String empRole;

    // No-argument constructor
    public Employee() {
        this.empID = 0;
        this.empName = null;
        this.empRole = null;
    }

    // Constructor with empID and empName (empRole hardcoded as Full Stack Developer)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Full Stack Developer"; // Hardcoded role
    }
    // Constructor with empID
	public Employee(int empID) {
		super();
		this.empID = empID;
	}

	// Getter methods
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    // Setter methods
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    // Overriding toString() method
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", empRole=" + empRole + "]";
	}
	
	// Overriding compareTo() method
	@Override
	public int compareTo(Employee o) {
		System.out.println("In compareTo Method"+this.empID+"-----"+o.empID);
		return this.empID-o.empID;                                 
	}

	// Overriding hashCode() method
	@Override
	public int hashCode() {
		System.out.println("In Hashcode Method"+empID);
		return empID;
	}
	
	// Overriding equals() method
	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals Method"+this.empID+"-----"+((Employee)obj).empID);
		return this.empID==((Employee)obj).empID;
	}


    
}
