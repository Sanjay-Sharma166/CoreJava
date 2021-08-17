package com.yash.array.ClassDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Customer
{
	 int id;
     String name;
      int quantity;
      
      public Customer(int id,String name, int quantity) {
          this.id=id;
          this.name = name;
          this.quantity = quantity;
      }
      public int getid()
      {
          return id;
      }

      public void setid(int id) {
          this.id = id;
      }
      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getquantity() {
          return quantity;
      }

      public void setquantity(int quantity) {
          this.quantity = quantity;
      }
     
	public static void main(String[] args)
	{
		List<Customer> product = new ArrayList<>();
		  product.add(new Customer(1,"Biscuit",10));
		  product.add(new Customer(2,"Maggi",15));
		  product.add(new Customer(3,"Rice",19));
		  product.add(new Customer(4,"Pulses",20));
		  Iterator<Customer> itr=product.iterator();
		  while(itr.hasNext())
		  {
			  Customer c=itr.next();
			  System.out.println(c.id+" "+c.name+" "+c.quantity);
		  }
	}

}
