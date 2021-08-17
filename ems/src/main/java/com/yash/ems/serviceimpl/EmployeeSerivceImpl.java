package com.yash.ems.serviceimpl;

import java.util.List;
import java.util.Scanner;

import com.yash.ems.exception.EmployeeByDepartmentNotFoundException;
import com.yash.ems.exception.EmployeeBySalaryNotFoundException;
import com.yash.ems.exception.EmployeeByNameNotFoundException;
import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.modal.Employee;
import com.yash.ems.service.EmployeeService;


public class EmployeeSerivceImpl implements EmployeeService 
{
	
private static List<Employee>empList;
Scanner sc=new Scanner(System.in);

@Override
public void getEmployeeById() throws EmployeeIdNotFoundException {
	int id =sc.nextInt();
	if(empList.stream().anyMatch(e->e.getId()==id))
	{
		empList.stream().filter(e ->e.getId()==id)
		.forEach(System.out::println);
		System.out.println("\n");
	}
	else
	{
		throw new EmployeeIdNotFoundException("Employee Id Not Found");
	}
}

@Override
public void getEmployeeByName() throws EmployeeByNameNotFoundException {
	String name=sc.next();
	if(empList.stream()
			.anyMatch(e->e.getName().equalsIgnoreCase(name)))
			{
		empList.stream()
		.filter(e->e.getName().equalsIgnoreCase(name))
		.forEach(System.out::println);
		System.out.println("\n");
			}
	else
	{
		throw new EmployeeByNameNotFoundException("Employee Name Not Found");
	}
}

@Override
public void getEmployeeByDepartment() throws EmployeeByDepartmentNotFoundException {
	String department=sc.next();
	if(empList.stream()
			.anyMatch(e->e.getDepartment().equalsIgnoreCase(department)))
			{
		empList.stream()
		.filter(e->e.getDepartment().equalsIgnoreCase(department))
		.forEach(System.out::println);
		System.out.println("\n");
			}
	else
	{
		throw new EmployeeByDepartmentNotFoundException("Employee Department Not Found");
	}
}

@Override
public void getEmployeeBySalary() throws EmployeeBySalaryNotFoundException 
{
	double salary=sc.nextDouble();
	if(empList.stream()
			.anyMatch(e->e.getSalary()==salary))
			{
		empList.stream()
		.filter(e-> e.getSalary()==salary)
		.forEach(System.out::println);
		System.out.println("\n");
			}
	else
	{
		throw new EmployeeBySalaryNotFoundException("Employee Salary Not Found");
	}
}


@Override
public void getAllDepartment() {
	empList.stream()
	.map(Employee::getDepartment)
	.distinct()
	.forEach(System.out::println);
	System.out.println("\n");
}

public static void EmpList(List<Employee> initEmpList) 
{
	empList=initEmpList;
}

@Override
public void getAllEmployees() {
	empList.forEach(System.out::println);
	System.out.println("\n");
}
}