package com.yash.Inhr_polyQ3;

public class CurrentAccount extends Account
{
	private double limit;
	
	public CurrentAccount(int accntnum,double limit)
	{
		super(accntnum);
		this.limit=limit;
	}
	
	public double getLimit()
	{
		return this.limit;
	}

public void setLimit(double limit)
{
	this.limit=limit;
	}
public void withdraw(double limit)
{
	if(limit<=this.limit)
		super.withdraw(limit);
	else
		{
		System.out.println("Sorry,Limit Exceeded");
		}
	}
public String toString()
{
	return super.toString()+"Limit:"+limit;
	}
}
