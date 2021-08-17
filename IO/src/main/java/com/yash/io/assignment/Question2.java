package com.yash.io.assignment;

import java.io.File;
import java.io.FileInputStream;

public class Question2 
{
	public static void main(String args[]) throws Exception
	{  
		try
		{
			File f=new File("D:\\company\\basicInfo.txt");
			System.out.println("Filename : "+f.getName()+"Filepath : "+f.getPath()+"Fileparent : "+f.getParent()+"Fileexist : "+f.exists());
			FileInputStream f1=new FileInputStream(f);
			int i;
			while((i=f1.read())!=-1)
				System.out.println((char)i);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
  }    

}
