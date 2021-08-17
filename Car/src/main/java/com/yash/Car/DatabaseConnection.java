package com.yash.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;

public class DatabaseConnection 
{
	public  Connection con;
	public  Statement st;
	
    static Logger logger=Logger.getAnonymousLogger();
    
	public DatabaseConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carinfoassignment","root","root");
        //logger.info("Car Database Connected...");
		//logger.info("\n Customer's Info Database: ");
        st=(Statement)con.createStatement();
	
	}
}
