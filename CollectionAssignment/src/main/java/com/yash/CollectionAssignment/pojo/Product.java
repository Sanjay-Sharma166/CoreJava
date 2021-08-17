package com.yash.CollectionAssignment.pojo;

import java.util.Objects;

public class Product 
{
	public long productId;
	public String productName;
	public double productPrice;

	public Product(long productId, String productName, double productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
}
