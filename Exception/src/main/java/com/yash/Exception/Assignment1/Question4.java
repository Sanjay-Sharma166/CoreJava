package com.yash.Exception.Assignment1;

import com.yash.Classdemo.Exception.Product;

public class Question4 {

	public static void main(String[] args) {
		//using product class
		
		Product p[]=new Product[5];
		p[0]=new Product(1,"Melody",5);
		p[1]=new Product(2,"Mangobite",2);
		p[2]=new Product(3,"Eclairs",3);
		p[3]=new Product(4,"Dairymilk",10);
		try
		{
			for(Product p1:p)
			{
				p1.getDetails();
			}
			p[6]=new Product(5,"perk",5);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException : object is not assigned");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException: object assigned beyond the limit");
		}

	}

}
