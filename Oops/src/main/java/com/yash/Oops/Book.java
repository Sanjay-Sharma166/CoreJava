package com.yash.oopsconceptdemo1;

public class Book {
String Book_Name;
double Book_Price;
String Book_Type;
int count=0;
public void setDetails(String Book_Name,double Book_Price,String Book_Type)
{
	this.Book_Name=Book_Name;
	this.Book_Price=Book_Price;
	this.Book_Type=Book_Type;
	count++;
}
public void getDetails() {
	System.out.println("Book Name is: "+Book_Name+"\nBook Price is: "+Book_Price+"\nBook Type is: "+Book_Type);
	}

}
