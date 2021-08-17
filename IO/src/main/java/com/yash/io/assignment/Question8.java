package com.yash.io.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		//converttobytearray
		System.out.println("Enter the file name or file path");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		try
		{
			File file=new File(s);
			FileInputStream fstream = new FileInputStream(file);
			
			byte[] arr= new byte[(int)file.length()];
			fstream.read(arr);
			fstream.close();
			
			System.out.println(Arrays.toString(arr));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
