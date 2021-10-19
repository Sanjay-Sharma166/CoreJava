package com.yash.ems.service;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.model.Employee;

/**
 * EmployeeService Interface for declaring additional methods
 * @author sanjay.sharma
 *
 */
public interface EmployeeService {
	/*
	 * this getid method is used for getting records by id from table employee
	 */
	public Employee getEmployeeById(int empid) throws EmployeeIdNotFoundException;

	/*
	 * this getname method is used for getting records by Name from table employee
	 */
	public Employee getEmployeeByName(String empname) throws InvalidNameException;

	/**
	 * Dao layer methods
	 * 
	 */
	/*
	 * this save method is used for inserting records into table employee
	 */
	public boolean save(Employee employee);

	/*
	 * this findAll method is used for fetching records from Employee table
	 */
	public List<Employee> findAll();

	/*
	 * this update method is used for updating records into table employee
	 */
	public boolean update(Employee employee);

	/*
	 * this delete method is used for deleting records from employee table
	 */
	public boolean delete(int id);
	
	
}
