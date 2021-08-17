package com.yash.Inhr_polyQ3;

public class Account 
{
 private double balance;
 private int accntnum;
 
 public Account(int a)
 {
	 balance=0.0;
	 accntnum=a;
 }
 
 public void deposit(double sum)
 {
	 if(sum>0)
		 balance+=sum;
	 else
		 System.err.print("Account.deposie(...):"+"cannot deposit negative amount.");
 }
 
 public void withdraw(double sum)
 {
	 if(sum>0)
		 balance=sum;
	 else
		 System.err.println("Account.withdraw(...):"+"cannot withdraw negative amount.");
 }
 
 public double getBalance()
 {
	 return balance;
 }
 
 public double getAccountNumber()
 {
	 return accntnum;
 }
 public String toString()
 {
	 return "Acc" +accntnum+":"+"balance ="+balance;
 }
 public final void print()
 {
	 System.out.println(toString());
 }
}
