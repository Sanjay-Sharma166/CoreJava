package com.yash.Javabasic;

public class TrafficLight
{
	public static void main(String[] args) {
		  int signal=2;
		  switch(signal)
		  {
		  case 0:
			  System.out.println("Signal is Red.... Please Stop");
			  break;
		  case 1:
			  System.out.println("Signal is Yellow... Be Ready");
			  break;
		  case 2:
			  System.out.println("Signal is Green... Can Go");
			  break;
			  
			  default:
				  System.out.println("INVALID");
				  break;
		  }
	}

}
