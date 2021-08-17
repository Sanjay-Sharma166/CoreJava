package com.yash.Classdemo.Exception;

public class Example 
{
	static void canVote(int age) {
		if(age<18)//ageException
		try{
			throw new Exception();
		}
		catch(Exception e){
			System.out.println("You are not an adult !!\n You cannot vote, your age is :"+age);
		}
		else 
			System.out.println("You are an adult..\nYou can vote... your age is :"+age);
		}
		public static void main(String[] args) {
			canVote(20);
			canVote(5);
			canVote(30);
			canVote(10);

		}

}
