package com.yash.emsJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ems 
{
static Logger logger=Logger.getAnonymousLogger();
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String i=Constant.STR_EMPTY;
		try(Scanner sc=new Scanner(System.in))
		{
			do
			{
				System.out.println("Select your choice -");
				System.out.println("1. Get All employee's Detail");
				System.out.println("2. Insert Employee Record");
				System.out.println("3. Update Employee Record");
				System.out.println("4. Delete Employee Record");
				System.out.println("0. Exit");
				i=sc.next();
				switch(i)
				{
				case Constant.STR_1:
					System.out.println("Employee's List:");
					employeeList();
					break;
				case Constant.STR_2:
					System.out.println("Please Insert Record:");
					insertRecord();
					break;
				case Constant.STR_3:
					System.out.println("Updated Record:");
					updateRecord();
					break;
				case Constant.STR_4:
					System.out.println("Deleted Record");
					deleteRecord();
					break;
				}
			}
			while(!i.equals(Constant.STR_0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
				
		}
	}
		
	public static void employeeList()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			
			ResultSet rs= db.st.executeQuery("select * from worker ");
			
			while(rs.next())		
			{
				System.out.println("Employee's Info : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
			}
			db.con.close();
			db.st.close();
			rs.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void insertRecord()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			db.st.executeUpdate("INSERT INTO employee VALUES('7','Ronak','22','Delhi','45000')");
			ResultSet rs= db.st.executeQuery("select * from employee");
			
			while(rs.next())		
			{
				System.out.println("Record after insertion : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
			}
			db.con.close();
			db.st.close();
			rs.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateRecord()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			db.st.executeUpdate("UPDATE employee SET id=7 where name='Ronak'");
			ResultSet rs= db.st.executeQuery("select * from employee");
			
			while(rs.next())		
			{
				System.out.println("Record after updation : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
			}
			db.con.close();
			db.st.close();
			rs.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteRecord()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			db.st.executeUpdate("DELETE FROM employee WHERE id=4;");
			ResultSet rs= db.st.executeQuery("select * from employee");
			
			while(rs.next())		
			{
				System.out.println("Record after deletion : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
			}
			db.con.close();
			db.st.close();
			rs.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
