package com.yash.SpringJDBC.dao;

import java.util.List;

import com.yash.SpringJDBC.entities.Employee;

public interface EmployeeDao {


	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int Id);
	public List<Employee> getAllEmployee();
}
