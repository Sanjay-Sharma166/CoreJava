package com.yash.oops_demo;
/**
 * abstract class creation
 * @author sanjay.sharma
 *
 */
public abstract class Employee 
{
	final static String address="Indore";
	
	Employee()
	{
		System.out.println("Employee Default Constructor");
	}
	static void getPincode()
	{
		System.out.println("452006");
	}
	void getCompanyName()//concrete method OR non abstract method
	{
		System.out.println("YASH Technology");
	}
	abstract void getSal();//abstract method
	abstract void getId();
	abstract void getDesg();
}
