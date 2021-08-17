package com.yash.Pattern;


import java.util.Scanner;


public class Question4 
{
	//CurrencyFormat
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	
	        String data=sc.nextLine();
	        String cdata="";
	        int rm=data.length()%3;
	        
	        if(data.length()<=3)
	        {
	            cdata=data;
	        }
	        else{
	          for(int p=data.length()-3;p>=0;p=p-3)
	          {
	   
	            String temp=data.substring(p,p+3);            
	            cdata=","+temp+cdata;
	          }
	          
	          String rms=data.substring(0,rm);//1 2 3 4 5 6 7
	          cdata=rms+cdata;
	          
	          if(cdata.startsWith(","))
	          {
	              cdata=cdata.substring(1);
	          }
	        }
	        System.out.println(cdata);
	        sc.close();

	    }

}
