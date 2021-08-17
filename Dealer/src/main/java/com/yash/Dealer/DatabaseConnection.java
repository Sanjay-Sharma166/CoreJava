package com.yash.Dealer;

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
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dealerassignment","root","root");
        //logger.info("Dealer Database Connected...");
		//logger.info("\n Dealer's Info Database: ");
        st=(Statement)con.createStatement();
	
	}

}
