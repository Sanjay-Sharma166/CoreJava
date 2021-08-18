package com.yash.CollectionAssignment.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.yash.CollectionAssignment.pojo.Patient;

public class HealthCheckupApp	
{
	public static void main(String[] args)
	{
		HashSet<Patient> set = new HashSet<>();
		Patient p1 = new Patient(1,"Ravi",22);
		Patient p2 = new Patient(2,"Rahul",23);
		Patient p3 = new Patient(3,"Shyam",25);
		Patient p4 = new Patient(4,"Shubham",27);
		Patient p5 = new Patient(5,"Shakti",24);
		Patient p6 = new Patient(6,"Arpit",26);
		Patient p7 = new Patient(7,"Laksh",23);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		set.add(p7);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
		ArrayList<Patient> list = new ArrayList<Patient>(set);
		System.out.println("Details of First Patient :");
		System.out.println(list.get(0));
		
		System.out.println("First five patient details :");
		System.out.println(list.subList(0, 4));

	}
}
