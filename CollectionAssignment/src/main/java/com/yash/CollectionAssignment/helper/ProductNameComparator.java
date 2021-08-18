package com.yash.CollectionAssignment.helper;

import java.util.Comparator;

import com.yash.CollectionAssignment.pojo.Product;

public class ProductNameComparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {

       return o1.productName.compareTo(o2.productName);
	}
	

}
