package com.yash.Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DAndT2
{
	public static void main(String args[])
	{
		DAndT2 dandt2 = new DAndT2();
		dandt2.testLocalDateTime();
	   }
		
	   public void testLocalDateTime()
	   {
	      // Get the current date and time
	      LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
			
	      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
		
	     
	   }
	}