package com.yash.enumdemo;

public enum BankInterestRates {

SBI(10),BOI(12),ICICI(15),PNB(13);
int interestrate;

private BankInterestRates(int interestrate)
{
	this.interestrate=interestrate;
	}

public int getInterestRate()
{
	return this.interestrate;
}
}
