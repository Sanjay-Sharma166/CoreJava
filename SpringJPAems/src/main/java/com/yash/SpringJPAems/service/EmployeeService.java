package com.yash.SpringJPAems.service;

import java.util.List;

import com.yash.SpringJPAems.entities.Employee;

public interface EmployeeService
{
	public int insert(Employee employee);
	public List<Employee> getAllEmployee();
	public int update(Employee employee);
	public int delete(int Id);
	public List<Employee> getEmpById(int Id);
	public List<Employee> getEmpByName(String Name);
}
