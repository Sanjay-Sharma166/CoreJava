package com.yash.String.Assignment;

public class StringDemo {
	 private String input;

		public String getInput() 
		{
			return input;
		}

		public void setInput(String input) 
		{
			this.input = input;
			
		}
		
		public String getRequiredData() 
		{
				return getInput();
		}
		
		public static void main(String args[])
		{
			StringDemo obj = new StringDemo();
			obj.setInput("Java Test");
//			obj.setInput(null);
			System.out.println(obj.getRequiredData());
		}

}
