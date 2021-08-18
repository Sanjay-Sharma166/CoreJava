package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.getSal();
		m.getDesg();
		m.getCompanyName();
		m.getId();
		Employee.getPincode();
		System.out.println(Employee.address);
	}

}
