package com.yash.Hashsetwithcustomer;

import java.util.HashSet;

public class PersonApp {

	public static void main(String[] args)
	{
		HashSet<Person> product = new HashSet<Person>();
        product.add(new Person(1,"Melody",1));
        product.add(new Person(2,"MangoBite",2));
        product.add(new Person(3,"DairyMilk",10));
        product.add(new Person(4,"Eclairs",5));
        product.add(new Person(5,"Alpeinlibe",6));

               System.out.println("Product Size"+product.size());
               System.out.println(product);
               System.out.println("product empty:"+product.isEmpty());
               product.remove("Eclairs");
               System.out.println(product);
                 
	}
}
