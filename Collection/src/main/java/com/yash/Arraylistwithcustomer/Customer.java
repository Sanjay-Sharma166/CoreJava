package com.yash.Arraylistwithcustomer;

public class Customer {

	long id;
	String name;
	int quantity;
	
	public Customer(long id,String name, int quantity)
	{
		super();
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}

	@Override
	public String toString() {
		return "Product detail : [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
}
