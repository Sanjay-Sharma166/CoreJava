package com.yash.arrays.assignment;


import java.util.*;  
import java.util.stream.*;  


public class sortedList {
		
	public static void main(String[] args)   
	{  
		System.out.println("Assignment Question : 2");
        
		List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");  
		List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
		sortedList.forEach(System.out::println);  
	}  
	}  

