package com.yash.Classdemo.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileDemo {

public static void main(String[] args) {
		
		try 
		{
			File f=new File("D:\\file.txt");
			System.out.println("Filename : "+f.getName()+"Filepath : "+f.getPath()+"Fileparent : "+f.getParent()+"Fileexist : "+f.exists());
			FileInputStream in=new FileInputStream(f);
			int i;
			while((i=in.read())!=-1)
				System.out.println((char)i);
			
			  FileReader f1=new FileReader(f);
			    while((i=f1.read())!=-1)
			    	System.out.println((char)i);
		    	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
