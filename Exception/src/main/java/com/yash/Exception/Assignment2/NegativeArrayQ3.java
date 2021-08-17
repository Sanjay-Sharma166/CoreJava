package com.yash.Exception.Assignment2;

import java.util.Scanner;

public class NegativeArrayQ3 {
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);

	int sz;
	int[] arr;
	System.out.print("NegativeArrayQ3");
	System.out.println("Enter array size:");
	sz = scan.nextInt();

	try
	{
	arr = new int[sz];
	}
	catch (NegativeArraySizeException e)
	{
	System.out.println("Negative size of array");
	System.out.println("Array not created" +e);
	return;
	}

	catch (NumberFormatException e)
	{
	System.out.println("Error: numeric format");
	System.out.println("Array not created" +e);
	return;
	}

	System.out.println("Array created successful.\n Enter values in the array");

	for (int i = 0; i < sz; i++)
	arr[i] = scan.nextInt();
	System.out.println("Enter indexing :");
	sz = scan.nextInt();

	try
	{
	System.out.println(arr[sz - 1]);
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Error in index" +e);
	}
	}
}
