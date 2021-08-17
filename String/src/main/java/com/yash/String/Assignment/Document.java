package com.yash.String.Assignment;

import com.yash.String.Assignment.Document;

public class Document
{
	static String title;
	static String filepath;
	
	void setDocument(String title,String filepath)
	{
		this.title=title;
		this.filepath=filepath;
	}
	void getDocument()
	{
		System.out.println("The documents were:Title"+title+"Filepath"+filepath);
	}
	static String showDocumentInformation()
	{
		String s = "title:"+title+ ","+"filepath:"+filepath; 
		return s;
	}
	
	public static void main(String[] args) {
		Document d = new Document();
		d.setDocument("java basics","c:/document/corejava/basics/introduction.pdf");
		d.getDocument();
		
	
	}

}
