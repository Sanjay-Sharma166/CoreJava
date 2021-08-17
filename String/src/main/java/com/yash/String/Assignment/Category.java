package com.yash.String.Assignment;

import com.yash.String.Assignment.Category;

public class Category {

	static int id;
	static String name;
	static int date;
	
	void setDetails(int id, String name,int date)
	{
		this.id=id;
		this.name=name;
		this.date=date;
	}
	void getDetails()
	{
		System.out.println("The details were:Id-"+id+"Name-"+name+"createdDate-"+date);
	}
	static String showCategoryDetails()
	{
		String s = "Id"+ id+"Name"+ name+"createdDate"+ date;
		return s;
	}
	
	public static void main(String[] args) {
		Category c = new Category();
		c.setDetails(101,"core_java",31-01-2017);
		c.getDetails();
		
	
	}

}
