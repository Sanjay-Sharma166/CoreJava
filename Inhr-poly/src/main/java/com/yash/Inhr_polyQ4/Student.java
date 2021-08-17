package com.yash.Inhr_polyQ4;

public class Student 
{
	String name;
	int age;
	String address;
	{
		this.name="unknown";
		this.age=0;
		this.address="not available";
	}
	public void setInfo(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name, int age, String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
