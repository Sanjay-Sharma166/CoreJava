package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class HouseBuild {

		int houseNo; //address
		String ownerName; //name of Owner
		double price; //price of House
		String color; //interior color
		String Excolor; //exterior color
		String Builder;//builder of House
		HouseBuild()
		{
			System.out.println("");
		}
		HouseBuild(int houseNo,String ownerName,double price,String color,String Excolor,String Builder)
		{
			this.houseNo=houseNo;
			this.ownerName=ownerName;
			this.price=price;
			this.color=color;
			this.Excolor=Excolor;
			this.Builder=Builder;
		}
		void getDetails()
		{
			System.out.println("\tThe House details are \nHouse Number:- "+houseNo+"\nOwner name:- "+ownerName+
					"\nHouse price:- "+price+" sq Feet"+"\nInterior color:- "+color+"\nExterior color:- "+Excolor+"\nBuild By:- "
					+Builder+
					"\n---------------------");

		}

	}


