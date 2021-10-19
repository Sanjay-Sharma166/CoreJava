package com.yash.Springdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee POJO to store id, name, city, salary, designation 
 * @author sanjay.sharma
 *
 */
@Entity
@Table(name="Employee")
public class Employee
{
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/**
	 * Id of Employee
	 */
	int id;
	@Column(name="Name")
	/**
	 * Name of Employee
	 */
	String name;
	@Column(name="City")
	/**
	 * City of Employee
	 */
	String city;
	@Column(name="Salary")
	/**
	 * Salary of Employee
	 */
	double salary;
	@Column(name="Designation")
	/**
	 * Designation of Employee
	 */
	String designation;
	
	//Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor
	public Employee(String name, String city, double salary, String designation) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.designation = designation;
	}
	
	//Getter and Setter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
