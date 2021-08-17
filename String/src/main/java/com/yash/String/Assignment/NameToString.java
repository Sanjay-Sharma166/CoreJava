package com.yash.String.Assignment;

public class NameToString 
{
	public static void main(String[] args) 
	{
		double d=34.145;
		
        	String s = Double.toString(d);

        	int decimal = s.indexOf('.');
        	System.out.println(s.substring(0, decimal).length()+ " digits before decimal point.");
        	
    }

}
