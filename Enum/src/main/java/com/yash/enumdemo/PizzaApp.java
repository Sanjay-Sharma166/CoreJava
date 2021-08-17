package com.yash.enumdemo;

public class PizzaApp 
{
	public static void main(String[] args) {
		
		PizzaSize[] p= PizzaSize.values();
		for(PizzaSize p1:p)
		{
			System.out.println("The PizzaSize were :"+p1+" \nSize of Pizza : "+p1.getSize());
		}
	}

}
