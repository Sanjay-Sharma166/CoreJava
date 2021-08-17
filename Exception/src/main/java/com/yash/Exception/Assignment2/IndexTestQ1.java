package com.yash.Exception.Assignment2;

import java.util.Scanner;

public class IndexTestQ1 {

	public static void main(String args[])
	{
		String [] FirstName= {"Sanjay","Shiv", "Ramu" ,"Kashish","Anju","Mohan","Shweta","Pravin","Jatin","Kalu"};
		String integer;
		try 
		{
			System.out.println("IndexTestQ1");
			System.out.println("Enter the name 1-10 for diplaying:");	
			Scanner sc=new Scanner(System.in);
			integer=sc.nextLine();
			int i=Integer.parseInt(integer);
			i=i-1;
			System.out.println(FirstName[i]);
			sc.close();

		}
		catch(Exception e)
		{
			System.out.println("Displayed Name" + e);
		}
	}


}
