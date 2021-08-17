package com.yash.Classdemo.Exception;

import com.yash.Classdemo.Exception.Product;

public class Product
{
	 static int Id;
	  static String name;
	  double price;
	  
	  public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	void setDetails(int id,String name,double price)
	  {
	this.Id=Id;
	this.name=name;
	this.price=price;
	  }
	  public void getDetails() 
	  {
		  System.out.println("The product details are- Id: "+Id+"Name:"+name+"Price:"+price);
	  }
		public static void main(String[] args) {

			Product p = new Product(Id, name, Id);
		p.setDetails(1,"Oppo",20000);
		
			p.getDetails();
		}
		

}
