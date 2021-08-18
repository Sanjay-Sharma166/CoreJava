package com.yash.oopsconceptdemo1;

public class MainBook {
public static void main(String args[]) {
	Book b=new Book();
	b.setDetails("Black Clover",744.86,"Manga Series");
	b.getDetails();
	System.out.println("The number of books written by the author:"+b.count);
}
}
