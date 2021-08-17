package com.yash.io.assignment;

import java.io.Serializable;

public class Employee implements Serializable
{
	int id;
	String name;
	String designation;
	double salary;
	String dateOfJoining;
	public Employee()
	{
		super();
		
	}
	public Employee(int id, String name,String designation, double salary, String dateOfJoining)
	{
		super();
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


}
