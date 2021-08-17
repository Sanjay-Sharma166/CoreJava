package com.yash.Javabasic;

public class TollWays
{
	public static void main(String[] args) {
		   int signal=100;
		   switch(signal)
		   {
		   case 45:
			   System.out.println("Car can move");
			   break;
		   case 100:
			   System.out.println("Bus can move");
			   break;
		   case 150:
			   System.out.println("Truck can move");
			   break;
		   case 210:
			   System.out.println("Heavy vehicle can move");
			   break;
			   
			default:
				System.out.println("INVALID");
				break;
		   }
		}

}
