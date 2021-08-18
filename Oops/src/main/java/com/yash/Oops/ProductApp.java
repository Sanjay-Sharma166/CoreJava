package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class ProductApp 
{
	public static void main( String[] args )
	{

		/*	Product p=new Product();//object is created
		p.setDetails(1,"Mobile",30000);//setting the value for product class via method
		p.getDetails();
		Product p1=new Product();
		p1.setDetails(2,"Mobile",40000,"Black");
		p1.getDetails();//deisplay the details of product
		Customer c=new Customer();
		c.getDetails();
		 */

		Product p=new Product(1,"TV",23000,"");
		p.getDetails();
		Product p1=new Product(2,"TV",3400,"Black");
		p1.getDetails();
		
		//Mobile m=new Mobile(1,"Samsung",2000.0,"Black",64,16);
		//m.getDetails();
		
		
	}
}
