package com.yash.Exception.Assignment2;

import java.util.Scanner;

public class DoubleParseQ2 {

	public static void main(String[] args)
	{  
	Scanner sc = new Scanner(System.in);  

	try
	{  
	System.out.print("DoubleParseQ2");
	System.out.print("Enter any string:");  
	String str = sc.next();  
	System.out.println("Your entered string is :" +str);

	Double d1 = Double.parseDouble(str);  
	String str1=null;  
	Double d2 = Double.parseDouble(str1);  

	System.out.println("1. Double value = " + d1);  
	System.out.println("2. Double value = " + d2);  
	}

	catch (NullPointerException e)
	{  
	System.out.println(e+ " has found.\nPlz enter a valid double integer");  
	}
	catch (NumberFormatException ex)
	{  
	System.out.println(ex+ " has found.\nPlz enter a valid double integer");  
	}  
	}  
}
