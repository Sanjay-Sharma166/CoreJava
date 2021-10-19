package com.yash.SpringJPAems.dao;

import java.util.List;

import com.yash.SpringJPAems.entities.Employee;

public interface EmployeeDao {


	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int Id);
	public List<Employee> getAllEmployee();
	public List<Employee> getEmpById(int Id);
	public List<Employee> getEmpByName(String Name);
}
