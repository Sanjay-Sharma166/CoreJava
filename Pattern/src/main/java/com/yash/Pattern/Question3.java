package com.yash.Pattern;


import java.util.Scanner;

public class Question3 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stu
			Scanner in = new Scanner(System.in);
			String data = in.nextLine();
			in.close();
			
			String temp="";
			int j=0;
			int k=0;
			int[] num = new int[50];
			String[] c= new String[20];
			for(int i=0;i<data.length();i++) {
				
				if(Character.isDigit(data.charAt(i))) {
					
	                c[j]=temp;
	                temp="";
	                String ntemp="";
	                ntemp+=data.charAt(i);
					num[k]=Integer.parseInt(ntemp);
	                // System.out.println(temp);
	                // System.out.println(Integer.parseInt(ntemp));
	                j++;
	                
					k++;
				}
	            else
				{
					String ctemp="";
	                ctemp+=data.charAt(i);
	                temp+=ctemp;
	            }
	            if(i==data.length()-1 && (!Character.isDigit(data.charAt(i))))
	            {
	                c[j]=temp;
	                j++;
	                temp="";
	            }
			}
			
			for(int x=0;x<k;x++)
			{
				System.out.println(num[x]);
			}
			
			for(int y=0;y<j;y++)
			{
				System.out.println(c[y].strip());
			}

		}

}
