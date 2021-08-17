package com.yash.ems.modal;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String address;
	private double phonenumber;
	private String department;
	
	public Employee(int id, String name, double salary, String designation, String address, double phonenumber,String department)
	{
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.address=address;
		this.phonenumber=phonenumber;
		this.department=department;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", address=" + address + ", phonenumber=" + phonenumber + ", department=" + department + "]";
	}


	
	
	

}
