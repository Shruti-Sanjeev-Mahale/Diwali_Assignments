package com.demo.service.practicequestions;

import java.util.List;

import com.demo.beans.practicequestions.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	boolean deleteById(int eid);

	List<Employee> displayAll();

	List<Employee> sortById();

	List<Employee> findByName(String nm);

	void saveAllEmployeesToFile();

}
