package com.yash.enumdemo;

public class BankApp {
	public static void main(String[] args) {
		
		BankInterestRates[] r=BankInterestRates.values();
		for(BankInterestRates r1:r)
		{
			System.out.println("Bank name :"+r1+",Interestrate :"+r1.getInterestRate());
		}
	}
}
