package com.yash.Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
        int[] num= {1,2,3,4};
        int i;
        try {
			String name="Yash";
		System.out.println(name);
		
		System.out.println(name.length());
		int a=10;
		   }
		catch(ArithmeticException e)
		{
		
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		finally
		{
			System.out.println("Finally Executed");
		}
	}
}
