package com.yash.ProductApp;

import java.util.*;

public class GetProductDetail extends Thread
{
	public static ArrayList<ProductDetail> p=new ArrayList<ProductDetail>();
	public static void main(String args[])
	{
		getProductList();
	    
	}
	
/**	@Override
	 public void run() {
	  System.out.println("Thread running" + guruname);
	  for (int i = 0; i < 4; i++) {
	   System.out.println(i);
	   System.out.println(guruname);
	   try {
	    Thread.sleep(1000);
	   } catch (InterruptedException e) {
	    System.out.println("Thread has been interrupted");
	   }
	  }
	 }**/
	public static ArrayList<ProductDetail> getProductList()
	{
		ProductDetail th1 = new ProductDetail(1,"Nokia",7000);
        ProductDetail th2 = new ProductDetail(2,"Vivo",9000);
        ProductDetail th3 = new ProductDetail(3,"Oppo",10500);
        ProductDetail th4 = new ProductDetail(4,"Realme",8000);
        ProductDetail th5 = new ProductDetail(5,"Micromax",5000);
        ProductDetail th6 = new ProductDetail(6,"Poco",6000);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();

//		p.add(new ProductDetail(1,"Nokia",7000));
//		p.add(new ProductDetail(2,"Vivo",9000));
//		p.add(new ProductDetail(3,"Oppo",10500));
//		p.add(new ProductDetail(4,"Realme",8000));
//		p.add(new ProductDetail(5,"Micromax",5000));
//		p.add(new ProductDetail(6,"Poco",6000));
//		Iterator<ProductDetail>itr=p.iterator();
//        while(itr.hasNext())
//        {
//        	ProductDetail c=itr.next();
//        	System.out.println(c.id+" "+c.name+" "+c.price);
//        }
//        System.out.println(p.size());
//        System.out.println(p);
        return p;
     }
	
	
}

