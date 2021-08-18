package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class Mobile extends Product
{
	int storage;
	double camera_Pixels;//Mobile having its own feature

	Mobile()
	{
		System.out.println("Mobile constructor invoked");
	}
	Mobile(int id, String name, double price, String color, int storage,double camera_Pixels)
	{
		super(name,price,id);                                                                                
		this.storage=storage;
		this.camera_Pixels=camera_Pixels;
		
	}

	void getDetails()
	{
		System.out.println(id+" "+name+" "+price+" "+color+" "+storage+" "+camera_Pixels);
	}
	

	
	
	
	
	
	
}