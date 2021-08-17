package com.yash.Java8;

@FunctionalInterface
interface Employee
{
	public void showId();
	default void show()
	{
		System.out.println("I am in Ujjain");
	}
	}

public class FintefaceDemo implements Employee {

	public static void main(String[] args) 
	{
	 FintefaceDemo i=new FintefaceDemo();
	 i.showId();
	 i.show();
	}

	@Override
	public void showId() {
		System.out.println("My roll no is 12345");
	}
	public void show()
	{
		System.out.println("I am in Ujjain of MadhyaPradesh");
	}
	

}
