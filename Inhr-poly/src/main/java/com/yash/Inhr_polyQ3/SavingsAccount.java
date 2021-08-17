package com.yash.Inhr_polyQ3;

public class SavingsAccount extends Account
{
	private double interest;
	
	public SavingsAccount(int accntnum, double interest)
	{
		super(accntnum);
		this.interest=interest;
	}
	public double getInterest()
	{
		double x=getBalance() + getBalance()*interest;
		return x;
	}
	public void setInterest(double interest)
	{
		this.interest=interest;
	}
	public void AddInterest(double interest)
	{
		double x=super.getBalance()*interest;
		super.deposit(x);
	}
	@Override
	public String toString() {
		return super.toString()+"Interest:"+interest;
	}
	
}
