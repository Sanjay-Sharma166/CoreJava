package com.yash.CollectionAssignment.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.yash.CollectionAssignment.helper.ProductIdComparator;
import com.yash.CollectionAssignment.helper.ProductNameComparator;
import com.yash.CollectionAssignment.pojo.Product;

public class ShoppingAppQ2
{
	public static void main(String[] args)
	{
		HashSet<Product> set= new HashSet<>();
		Product pr1 = new Product(101, "OPPO",6500.00);
		Product pr2 = new Product(102, "VIVO",8000.00);
		Product pr3 = new Product(103, "MICROMAX",5000.00);
		Product pr4 = new Product(104, "REDMI",9000.00);
		Product pr5 = new Product(105, "SAMSUNG",10000.00);
		Product pr6 = new Product(106, "ITEL",6000.00);
		set.add(pr1);
		set.add(pr2);
		set.add(pr3);
		set.add(pr4);
		set.add(pr5);
		set.add(pr6);

    for(Product p: set)
    {
    	System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
    }
    System.out.println("Collection Size:"+set.size());
    
    HashSet clone = new HashSet();
    clone = (HashSet)set.clone();
    System.out.println("Clone set:"+clone);
    
    List<Product> list = new ArrayList<Product>(set);
    Iterator itr = list.iterator();
    while(itr.hasNext())
    	{
    	   System.out.println(itr.next().toString());
    	}
    Collections.sort(list, new ProductIdComparator());
    System.out.println("Sorted by product id :");
    for(Product p : list)
    	{
    	  System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
    	}
    System.out.println("Get the first product of the list :");
    System.out.println(list.get(0));
    
    System.out.println("Get the Last product of the list :");
    System.out.println(list.get(list.size()-1));
    
    Collections.sort(list, new ProductNameComparator());
    System.out.println("Sorted by product name :");
    for(Product p : list)
    {
    	System.out.println(p.productId+" "+p.productName+" "+p.productPrice);
    }
    }
}
