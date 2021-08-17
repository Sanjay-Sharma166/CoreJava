package com.yash.Exception;

import java.io.IOException;



public class Employee {
	static long id;
	String name;
	
	public static void setId(long id) throws IOException
	{
		id=id;
		if(id<=0)
			throw new IOException("Invalid Employee Id");
	}
	public static void getId()
		{
			System.out.println(id);
		}
	

	public static void main(String[] args) throws IOException
	{
		Employee e=new Employee();
		e.setId(5);
		e.getId();
	}

}
