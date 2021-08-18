package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class Manager extends Employee
{

	@Override
	void getSal() {
		double salary=34000;
		System.out.println(salary);
		
	}

	@Override
	void getId() {
		long id=1;
		System.out.println(id);
	}

	@Override
	void getDesg() {
	String desg="manager";
	System.out.println(desg);
		
	}

	
}
