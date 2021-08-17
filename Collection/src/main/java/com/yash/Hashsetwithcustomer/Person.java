package com.yash.Hashsetwithcustomer;

public class Person {

	long id;
	String name;
	int price;
	
	public Person(long id,String name, int price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product detail : [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
