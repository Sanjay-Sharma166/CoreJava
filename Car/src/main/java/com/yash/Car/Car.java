package com.yash.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;


public class Car 
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
				System.out.println("1. Get All Customer's Detail");
				System.out.println("2. Insert Record");
				System.out.println("3. Update Record");
				System.out.println("4. Delete Record");
				System.out.println("0. Exit");
				i=sc.next();
				switch(i)
				{
				case Constant.STR_1:
					System.out.println("Customer's List:");
					customerList();
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
		
	public static void customerList()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			
			ResultSet rs= db.st.executeQuery("select * from car ");
			
			while(rs.next())		
			{
				System.out.println("Customer Info : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
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
			//db.st.executeUpadte("INSERT INTO car VALUES"+"("+RegNo+","+OwnerName+","+CarName+","+CarType+","+Engine+","+enginetype")"));
			//String sql=("INSERT INTO car VALUES('234678;,'Rahul Mahawar','Zen','Maruti','780','CC')");
			db.st.executeUpdate("INSERT INTO car VALUES('234678','Rahul Mahawar','Zen','Maruti','780','CC')");
			ResultSet rs= db.st.executeQuery("select * from car");
			
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
			db.st.executeUpdate("UPDATE car SET RegNo=876543 where OwnerName='Rahul Mahawar'");
			ResultSet rs= db.st.executeQuery("select * from car");
			
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
			db.st.executeUpdate("DELETE FROM car WHERE RegNo=876543;");
			ResultSet rs= db.st.executeQuery("select * from car");
			
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

