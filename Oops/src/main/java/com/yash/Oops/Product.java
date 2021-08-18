package com.yash.oops_demo;

/**
 * 
 * creating product class to display the properties of class product
 * 
 * @author sanjay.sharma
 *
 
 */
public class Product 
{
	int id; //id of product
	String name;//name of product
	double price;//price of product
	String color;//color of the product
	long storage;//storage of product

	void setDetails(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		id=1;
		name="Mobile";
		price=30000;

	}
	void setDetails(int id,String name,double price,String color)//setter method
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.color=color;
	}
	void getDetails()//getter method
	{
		System.out.println("The product details are product id "+id+" product name "+name+" product price "+price+" product color "+color);

	}
 */
public class Product 
{
	int id; //id of product
	String name;//name of product
	double price;//price of product
	String color;//color of the product

	Product()
	{
		System.out.println("");
	}
	Product(int id,String name,double price,String color)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.color=color;
	}
	void getDetails()
	{
		System.out.println("The product details are product id "+id+" product name "+name+" product price "+price+" product color "+color);

	}

}
