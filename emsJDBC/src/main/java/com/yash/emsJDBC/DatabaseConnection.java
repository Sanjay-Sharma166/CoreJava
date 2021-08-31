package com.yash.emsJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DatabaseConnection 
{
	public  Connection con;
	public  Statement st;
	
    static Logger logger=Logger.getAnonymousLogger();
    
	public DatabaseConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker","root","root");
        st=(Statement)con.createStatement();
	
	}
}
