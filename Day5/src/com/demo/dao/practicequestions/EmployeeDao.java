package com.demo.dao.practicequestions;

import java.util.List;

import com.demo.beans.practicequestions.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	boolean removeById(int eid);

	List<Employee> findAll();

	List<Employee> sortById();

	List<Employee> findByName(String nm);

	void saveEmployeesToFile();

}
