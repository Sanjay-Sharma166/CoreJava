package com.yash.ProductApp;

public class ProductDetail implements Runnable
{
	public long id;
	public String name;
	public int price;
	public Thread t;
	public ProductDetail(long id,String name, int price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Product detail : [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public void run() {
		  System.out.println("Thread running");
		  
		  System.out.println(id+" "+name+" "+price);
		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    System.out.println("Thread has been interrupted");
		   }
		  }
		 public void start() {
		  System.out.println("Thread started");
		  {
		   t = new Thread(this, name);
		   t.start();
		  }
		
	}
		 public static boolean addProduct(ProductDetail product)
			{
				ProductDetail.add(product);
				return true;
		     }

		private static void add(ProductDetail product) {
			// TODO Auto-generated method stub
			
		}
}
