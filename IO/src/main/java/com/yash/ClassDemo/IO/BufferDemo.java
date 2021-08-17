package com.yash.ClassDemo.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferDemo 
{

	public static void main(String args[]) throws IOException
	{
		try(FileInputStream fin=new FileInputStream("D:\\file.txt");
				BufferedInputStream bin=new BufferedInputStream(fin);
				FileOutputStream fout=new FileOutputStream("File2.txt");
				BufferedOutputStream bout=new BufferedOutputStream(fout);)
		{
			String s="Welcome to Buffer write";
			byte b[]=s.getBytes();
			bout.write(b);
			int x=0;
			while((x=bin.read())!=-1)
				System.out.println((char)x);
			bout.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
