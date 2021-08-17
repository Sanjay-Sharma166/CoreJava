package com.yash.io.assignment;

import java.io.File;
import java.text.SimpleDateFormat;

public class Question3
{
	 public static void main(String[] args) 
	 {
	         
	        File f = new File("D:\\company\\basicInfo.txt");   //pass the filename to object
	        System.out.println("Assignment Question: 03");
	        System.out.println("File name : "+f.getName());
	        System.out.println("Parent : "+f.getParent());
	        System.out.println("Path :  "+f.getPath());
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        System.out.println("Last modified date and time : " + sdf.format(f.lastModified()));
	        System.out.println("Exists : "+f.exists());
	        System.out.println("Length : "+f.length());
	        
	        
	        if(f.exists())
	        {
	            System.out.println("Is writeable : "+f.canWrite());
	            System.out.println("Is readable : "+f.canRead());
	            System.out.println("Is a directory : "+f.isDirectory());
	        }
	    }
}
