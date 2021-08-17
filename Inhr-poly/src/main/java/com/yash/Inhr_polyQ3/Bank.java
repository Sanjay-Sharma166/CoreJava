package com.yash.Inhr_polyQ3;

import java.util.Arrays;

public class Bank 
{

	public static void main(String[] args) {
      Account[] accnt=new Account[2];
      accnt[0]=new SavingsAccount(263010,0.25);
      accnt[1]=new CurrentAccount(253010,5000);
      
      System.out.println(Arrays.toString(accnt));
	}

}
