package com.yash.Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 
{
	//LandlineNumber
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		String s = in.nextLine();
		//String s ="7897898768";
		//String s ="3897898768";
		in.close();
		
	
		if(isValid(s))
			System.out.println("Valid number");
		else
			System.out.println("InValid number");
	}
	
	public  static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m =p.matcher(s);
		return (m.find() && m.group().equals(s));
		
	}


}
