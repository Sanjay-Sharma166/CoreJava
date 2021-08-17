package com.yash.enumdemo;

import com.yash.enumdemo.Enumdays.Day;

public class Enumdays {

	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  
	
	public static void main(String args[])
	{
	Day day=Day.FRIDAY;  
	  
	switch(day){ 
	
	case SUNDAY:   
	 System.out.println("sunday");  
	 break;  
	 
	case MONDAY:   
	 System.out.println("monday");  
	 break;  
	 
	case TUESDAY:   
		 System.out.println("Tuesday");  
		 break;
		 
	case WEDNESDAY:   
		 System.out.println("Wednesday");  
		 break;  
		 
	default:  
	System.out.println("other day");  
	}  
   }
}
