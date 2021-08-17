package com.yash.io.assignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question7 {
   
	public static void setReadOnly(File file)
	{
		file.setReadOnly();
	}
	public static void main(String[] args) {
    //SetReadOnly
		Scanner sc=new Scanner(System.in);
		String path=sc.next();
		File file = new File(path);
		file.setWritable(true);
		
		try
		{
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
