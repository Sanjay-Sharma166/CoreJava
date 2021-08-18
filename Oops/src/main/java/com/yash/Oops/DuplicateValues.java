package com.oops;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class DuplicateValues {

	public static void main(String[] args) {
	String [] ProductList = new String [] 
			{"Table_fan", "Bulb", "Fan", "Tv","Tv", "Bulb","kush", "Fan"};
	System.out.println("Duplicates....");
	for (int i=0; i< ProductList.length; i++)
	{
		for (int j=i+1; j< ProductList.length; j++)
		{
			if(ProductList[j] == ProductList[i]) {
				
				System.out.println(ProductList[j]);
			}
		}
	}

	}

}
