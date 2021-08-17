package com.yash.Exception.Assignment1;


import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question2 {


	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\file.txt");
		try(FileInputStream fis= new FileInputStream(f))
		{
			while(true)
			{
				int x =fis.read();
				if(x==-1)
				{
					break;
				}
				System.out.println((char)x);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
