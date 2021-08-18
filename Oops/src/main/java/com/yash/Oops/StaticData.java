package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class StaticData
{
	
	static int num=34;
	String name;
	public StaticData(int num,String name) 
	{
		super();
		this.num = num;
		this.name = name;
	}
	private void getDetails() {

		System.out.println(num+""+num);

	}
	static void display() {
		System.out.println("HELLO");
	}
	public static void main(String args[])
	{
		//StaticData d=new StaticData(1,"Yash");
		//d.getDetails();
		System.out.println(num);
		num=23;
		System.out.println(num);
		display();
	}

}
