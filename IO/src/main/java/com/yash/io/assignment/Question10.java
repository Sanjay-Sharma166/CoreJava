package com.yash.io.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question10 {

	public static void main(String[] args) {
		// Serialization
		Employee e1=new Employee(1,"Sanjay","Trainee",25000,"12-08-2021");
		String filename="file.ser";
		try
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream objStream = new ObjectOutputStream(file);
			objStream.writeObject(e1);
			System.out.println("Successfully serialized!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	try
	{
		FileInputStream file=new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e=(Employee)in.readObject();
		in.close();
		file.close();
		System.out.println("Object has been deserialized");
		System.out.println("Employee ID :"+e.getId());
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee designation:"+e.getDesignation());
		System.out.println("Employee salary:"+e.getSalary());
		System.out.println("Employee date of joining:"+e.getDateOfJoining());
	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	}

}
