package com.yash.array.ClassDemo;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String args[])
	{  
		  ArrayList<String> list=new ArrayList<String>();  
		      list.add("Cat");  //add element
		      list.add("Dog");    
		      list.add("Elephant");    
		      list.add("Goat");
		      list.add("Zebra");
		      list.add("Lion");
		      list.add("Lion");
		      System.out.println("The list is:"+list);  
		    
		      list.set(1, "Camel");//update element
		      System.out.println("Updated ArrayList " + list);
		      
		      list.remove("Lion");//remove element
		        System.out.println("After the Object Removal " +list);
		        
		        
		 }  

}
