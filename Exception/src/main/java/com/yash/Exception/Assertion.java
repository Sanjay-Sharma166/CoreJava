package com.yash.Exception;

public class Assertion {

public static void main(String[] args) {
		
		char operator = '-';             
	    
		int operand1 = 5, operand2 = 6, result = 0;
	    
		switch (operator) {
	    
		     case '+': result = operand1 + operand2; break;
	         case '-': result = operand1 - operand2; break;
	         case '*': result = operand1 * operand2; break;
	         case '/': result = operand1 / operand2; break;
	         default: assert false : "Unknown operator: " + operator;  
	      }
	      System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
	}

}
