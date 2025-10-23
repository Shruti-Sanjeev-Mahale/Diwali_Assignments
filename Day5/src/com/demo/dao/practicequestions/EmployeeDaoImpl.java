package com.demo.dao.practicequestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.practicequestions.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(100,"Mansi"));
		elist.add(new Employee(101,"Gauri"));
		elist.add(new Employee(102,"Kanchan"));
	}
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}
	public boolean removeById(int eid) {
		return elist.remove(new Employee(eid));
	}

	public List<Employee> findAll(){
		return elist;
	}
	
	@Override
	public List<Employee> sortById() {
	    List<Employee> lst = new ArrayList<>();
	    for (Employee e : elist) {
	        lst.add(e);
	    }

	    Comparator<Employee> c = (o1, o2) -> {
	        if (o1.getEmpID() > o2.getEmpID()) return 1;
	        else if (o1.getEmpID() < o2.getEmpID()) return -1;
	        else return 0;
	    };

	    lst.sort(c);
	    return lst;
	}


	public List<Employee> findByName(String nm){
		List<Employee> temp=elist.stream().filter(emp->emp.getEmpName().equals(nm)).collect(Collectors.toList());
		
		if(temp.size()>0) {
			return temp;
		}
		return null;
	}
	@Override
	public void saveEmployeesToFile() {
		 if (elist.isEmpty()) {
	            System.out.println("No employees to save.");
	            return;
	        }

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
	            for (Employee e : elist) {
	                writer.write(e.getEmpID() + "," + e.getEmpName() + "," + e.getEmpRole());
	                writer.newLine();
	            }
	            System.out.println("Saved " + elist.size() + " employees to file successfully!");
	        } catch (IOException e) {
	            System.out.println("Error saving to file: " + e.getMessage());
	        }
	    }
		
	}

	

