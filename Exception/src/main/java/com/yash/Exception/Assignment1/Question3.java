package com.yash.Exception.Assignment1;


import java.util.InputMismatchException;
import com.yash.Exception.Assignment1.Question3;
import com.yash.Exception.Assignment1.Super;

class Super
{
	}

public class Question3 extends Super{

	public static void main(String[] args)
	{
		int arr[]= new int[3];
		String str[]=new String[3];
		
		try
		{
			arr[1]=Integer.parseInt("one");
			
			Super s[]= new Super[3];
			s[2]= new Question3();
			
			Question3 q[]= new Question3[3];
			q[1]= (Question3) new Super();
		}
		catch(ClassCastException e)
		{
			System.out.println("Parent cannot converted to its child type");
		}
		catch(NumberFormatException | InputMismatchException e)
		{
			System.out.println("Integer array cannot store string values");
		}
}
}
