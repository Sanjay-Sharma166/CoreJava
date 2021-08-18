package com.yash.CollectionAssignment.helper;

import java.util.Comparator;

import com.yash.CollectionAssignment.pojo.Product;

public class ProductPriceComaparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.productPrice==o2.productPrice)
			return 0;
		else if(o1.productPrice > o2.productPrice)
			return 1;
		else
			return -1;
	}
	

}
