package com.yash.EMSspringmvcJDBC.dao;

import java.util.List;

import com.yash.EMSspringmvcJDBC.entities.Employee;

public interface EmployeeDao {


	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int Id);
	public List<Employee> getAllEmployee();
}
