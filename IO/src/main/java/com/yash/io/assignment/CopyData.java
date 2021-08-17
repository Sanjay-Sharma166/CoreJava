package com.yash.io.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyData 
{
	 public static void copyContent(File a, File b)
		        throws Exception
		    {
		        FileInputStream in = new FileInputStream(a);
		        FileOutputStream out = new FileOutputStream(b);
		  
		        try {
		  
		            int n;
		            while ((n = in.read()) != -1)
		            {
		            	out.write(n);
		            }
		        }
		        finally {
		            if (in != null)
		            {
		              in.close();
		            }
		            if (out != null)
		            {
		                out.close();
		            }
		        }
		        System.out.println("File Copied");
		    }
		  
		    public static void main(String[] args) throws Exception
		    {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Question No:1");
		        System.out.println("Enter the source filename from where you have to read/copy :");
		        String a = sc.nextLine();
		        File x = new File(a);// source file
		        System.out.println("Enter the destination filename where you have to write/paste :");
		        String b = sc.nextLine();
		        File y = new File(b);      // destination file
		        copyContent(x, y);
		    }

}
