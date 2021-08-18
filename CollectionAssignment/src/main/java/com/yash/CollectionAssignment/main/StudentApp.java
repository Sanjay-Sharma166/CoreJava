package com.yash.CollectionAssignment.main;

import java.util.Vector;

import com.yash.CollectionAssignment.pojo.Student;

public class StudentApp 
{
	public static void main(String[] args)
	{
		Vector<Student> v = new Vector<>();
		Student s1= new Student(1,"Shivam","5th");
		Student s2= new Student(2,"Ram","6th");
		Student s3= new Student(3,"Aarav","8th");
		Student s4= new Student(4,"Kiran","10th");
		Student s5= new Student(5,"Mahima","9th");

		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		v.addElement(s4);
		v.addElement(s5);
		
		for(Student s : v)
		{
			System.out.println(s);
		}
		
		System.out.println("Capacity:"+v.capacity());
		System.out.println("Size:"+v.size());
		System.out.println(v.contains(s2));
		System.out.println("Second record:"+v.get(1));


	}

}
