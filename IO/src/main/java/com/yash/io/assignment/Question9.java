package com.yash.io.assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// ListOfFiles
		System.out.println("List of files are :");
		File file=new File("D:\\company");
		File[] files=file.listFiles();
		int i=1;
		for(File f:files)
		{
			System.out.println(i+" ."+f.getName());
			i++;
		}
		System.out.println("Select any file to perform read/write operation:");
		Scanner sc= new Scanner(System.in);
		int index=sc.nextInt();
		
		File newFile=new File(files[(index-1)].getPath());
		try
		{
			FileReader fr=new FileReader(newFile);
			int j;
			while((j=fr.read())!=-1)
				System.out.println((char)j);
			fr.close();
			System.out.println("\nDo you want to write Something(yes/no)");
			String ans=sc.next();
			if(ans.equals("yes"))
			{
				System.out.println("Write something to append int the file:");
				String line=sc.next();
				FileWriter fw=new FileWriter(newFile, true);
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(line);
				System.out.println("Data successfully added:");
				pw.flush();
			}
			else
			{
				System.out.println("Thank you");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
			}
		
	}


