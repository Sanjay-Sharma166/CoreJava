package com.yash.Inhr_polyQ6;

public class Bank
{
    int accntnum;
    double balance;
    public double getBalance()
    {
    	return 0;
    }
    class SBI
    {
    	public double getBalance()
    	{
    		return 1000;
    	}
    }
    class HDFC
    {
    	public double getBalance()
    	{
    		return 1500;
    	}
    }
    class KOTAK
    {
    	public double getBalance()
    	{
    		return 2000;
    	}
    }
	public static void main(String[] args)
	{
		Bank b=new Bank();
		Bank.SBI sbi=b.new SBI();
		Bank.HDFC hdfc=b.new HDFC();
		Bank.KOTAK kotak=b.new KOTAK();
		
		System.out.println("SBI Balance :"+sbi.getBalance());
		System.out.println("HDFC Balance :"+hdfc.getBalance());
		System.out.println("KOTAK Balance :"+kotak.getBalance());
		
	}

}
