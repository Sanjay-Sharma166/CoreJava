package com.yash.Dealer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Dealer
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
				System.out.println("1. Get All Dealer's Detail");
				System.out.println("2. Search Detail By Name");
				System.out.println("3. Search Deatil By ModalYear");
			    System.out.println("4. Delete Record");
				System.out.println("0. Exit");
				i=sc.next();
				switch(i)
				{
				case Constant.STR_1:
					System.out.println("Dealer List:");
					dealerList();
					break;
			case Constant.STR_2:
				System.out.println("Detail By Name:");
				searchByName();
				break;
			case Constant.STR_3:
				System.out.println("Detail By Modal Year:");
				searchByModalYear();
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
		
		
	public static void dealerList()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			
			ResultSet rs= db.st.executeQuery("select * from dealer ");
			
			while(rs.next())		
			{
				System.out.println("Dealer's Info : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
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
	
	
	public static void searchByName()
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
				System.out.println("Record By Name : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
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
	
	
	
	public static void searchByModalYear()
	{
		DatabaseConnection db;
		try {
			db = new DatabaseConnection();
			db.st.executeUpdate("UPDATE car SET RegNo=876543 where OwnerName='Rahul Mahawar'");
			ResultSet rs= db.st.executeQuery("select * from car");
			
			while(rs.next())		
			{
				System.out.println("Record By Modal Year : "+rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4));
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
			db.st.executeUpdate("DELETE FROM dealer WHERE Dealer'sregNo=67446;");
			ResultSet rs= db.st.executeQuery("select * from dealer");
			
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
