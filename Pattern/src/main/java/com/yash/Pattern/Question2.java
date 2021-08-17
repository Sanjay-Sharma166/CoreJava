package com.yash.Pattern;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2
{
	//AadharNumber
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter aadhar no: ");
		String s = in.nextLine();
		//String s ="2234 3456 4567";	
		//String s ="";
		in.close();
	
		if(isValid(s))
			System.out.println("Valid number");
		else
			System.out.println("InValid number");

	}
	public  static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("^[0-9]{4}[ -]?[0-9]{4}[ -]?[0-9]{4}$");
		Matcher m =p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}


}
