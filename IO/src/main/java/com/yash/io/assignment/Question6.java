package com.yash.io.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question6 
{
	//Delete FileContent
public static void main(String args[])
{
	System.out.println("Enter file name or file path");
	Scanner sc=new Scanner(System.in);
	String path=sc.next();
	try
	{
		File file=new File(path);
		PrintWriter writer=new PrintWriter(file);
		writer.close();
		System.out.println("Contents deleted successfully");

	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
 }
}
