package com.java.Classdemo;

public class Array_ClassDemo {

	public static void main(String[] args) {
		int i;
		String[] technology= {"Java","Oracle","Python","Mysql"};
		System.out.println(technology);
		for(i=0;i<technology.length;i++)
		{
			System.out.println("The technologies are :\n"+technology[i]);
		}
		
		
		
		
		String[] fruits=new String[] {"Apple","Orange","Mango"};
		for(String a:fruits)
		System.out.println("The fruits are:\n"+a);
	
	
	}
}
