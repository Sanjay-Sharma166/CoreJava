package com.yash.CollectionAssignment.helper;

import java.util.Comparator;

import com.yash.CollectionAssignment.pojo.Product;

public class ProductIdComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1= (Product)o1;
		Product p2=(Product)o2;
		
		if(p1.productId==p2.productId)
			return 0;
		else if(p1.productId > p2.productId)
			return 1;
		else
			return -1;
	}

}
