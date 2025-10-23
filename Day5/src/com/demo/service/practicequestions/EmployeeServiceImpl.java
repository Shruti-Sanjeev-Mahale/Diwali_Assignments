package com.demo.service.practicequestions;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.practicequestions.Employee;
import com.demo.dao.practicequestions.EmployeeDao;
import com.demo.dao.practicequestions.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao =new EmployeeDaoImpl();
	}
	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		int id=sc.nextInt();
		System.out.println("enter name ");
		String nm=sc.next();
		Employee e = new Employee(id,nm);
		return edao.save(e);
	}
	
	@Override
	public boolean deleteById(int eid) {
		return edao.removeById(eid);
	}
	
	@Override
	public List<Employee> displayAll() {	
		return edao.findAll();
	}
	
	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}

	
	@Override
	public List<Employee> findByName(String nm) {
		return edao.findByName(nm);
	}
	@Override
	public void saveAllEmployeesToFile() {
		edao.saveEmployeesToFile();
		
	}





}
