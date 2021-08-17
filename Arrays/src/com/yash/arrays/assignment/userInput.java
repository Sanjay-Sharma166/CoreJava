package com.yash.arrays.assignment;

import java.util.*;

public class userInput {


public static void main ( String args [])

{

Scanner sc=new Scanner (System.in);

int n,I,p=0,c=0,o=0,e=0,z=0;

for(I=1;I<=20;I++);

{
	System.out.println("Assignment Question : 5");
    
System.out.println("Enter a number");

n=sc.nextInt();

if (n>0)

p++; //count of positive no's.

if (n<0)

c++; //count of negative no's.

if (n%2==0)

e++; //count of even no's.

if (n%2!=0)

o++; //count of odd no's

if (n==0)

z++; //count of zeros

}

System.out.println("number of positive numbers"+p);

System.out.println("number of negative numbers"+c);

System.out.println("number of odd numbers"+o);

System.out.println("number of even numbers"+e);

System.out.println("number of zeroes"+z);

}

}