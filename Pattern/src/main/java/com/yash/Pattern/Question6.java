package com.yash.Pattern;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 
{
	//EmailCheck
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter email id: ");
		String s = in.nextLine();
		//String s ="";	
		//String s ="";
		in.close();
	
		if(isValid(s))
			System.out.println("Valid email");
		else
			System.out.println("InValid email");

	}
	
	public  static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher m =p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}


}
