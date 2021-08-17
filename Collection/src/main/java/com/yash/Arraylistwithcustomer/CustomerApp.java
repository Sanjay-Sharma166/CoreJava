package com.yash.Arraylistwithcustomer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerApp {

	public static void main(String[] args)
	{
		List<Customer> product = new ArrayList<Customer>();
        product.add(new Customer(1,"Rice",20));
        product.add(new Customer(2,"Pulses",40));
        product.add(new Customer(3,"Maggi",30));
        product.add(new Customer(4,"Biscuit",10));
        Iterator<Customer>itr=product.iterator();
        while(itr.hasNext())
        {
        	Customer c=itr.next();
        	System.out.println(c.id+" "+c.name+" "+c.quantity);
        }
        System.out.println(product.size());
        System.out.println(product);

	}
}
