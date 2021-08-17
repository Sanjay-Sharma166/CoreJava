package com.yash.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogDemo
{
	static Logger logger = Logger.getLogger(LogDemo.class);
	  
	public static void main(String[] args)
	{
		 //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("Property\\Log4j.properties");
 
       
		    logger.info("This is the log for LogDemo");
		    System.out.println();
		    logger.debug("This is a debug message");
	        logger.warn("This is a warn message");
	        logger.error("This is an error message");
	        logger.fatal("This is a fatal message");
			}

}
