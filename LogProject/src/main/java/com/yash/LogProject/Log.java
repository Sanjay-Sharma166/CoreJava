package com.yash.LogProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log
{

	static Logger logger = Logger.getLogger(Log.class);
	public void Addition()
	 {
		try {
	 
   	 int a=2;
		 int b=5;
		 int sum;
	     sum=(a+b);
	    
	     logger.info("Operation perform Addition :");
		     System.out.println("Sum = "+sum);
	     }
	catch(ArithmeticException e)
	{
	
		logger.info(e);
	}
	 }
	 
	public static void main(String[] args) 
	{
		
		  
		//PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("Property\\Log.properties");
     
	  
	}
}
