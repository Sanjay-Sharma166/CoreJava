package com.yash.Java8;


import java.util.*;  
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Details
{  
    int id;  
    String name;
    String dept;
    float perct;  
      
    public Details(int id, String name, String dept, float perct)
    {  
        this.id = id;  
        this.name = name;
        this.dept=dept;
        this.perct=perct;  
    }  
          
    public int getId() 
    {  
        return id;  
    }  
    public String getName()
    {  
        return name;  
    }  
    public String getDept()
    {  
        return dept;  
    }  
    public float getPerct() 
    {  
        return perct;  
    }

	public static Stream<Details> stream() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object startsWith(String string) {
		// TODO Auto-generated method stub
		return null;
	}  
}  
  
public class Student
{  
  
    public static void main(String[] args)
    {  
          
        List<Details> studentList = new ArrayList<Details>();  
          
      
        studentList.add(new Details(1,"Sanjay","CS",65f));  
        studentList.add(new Details(2,"Abhishek","IT",55f));  
        studentList.add(new Details(3,"Manoj","EC",32f));  
        studentList.add(new Details(4,"Sunil","CS",55f));  
        studentList.add(new Details(5,"Shivam","ME",29f));
        System.out.println("Student Details");
        Iterator<Details>itr=studentList.iterator();
        while(itr.hasNext())
        {
        	Details c=itr.next();  
        	System.out.println(c.id+" "+c.name+" "+c.dept+" "+c.perct);
        } 
        long count=studentList.stream()
    		    .count();
    System.out.println("Total students:"+count);
    
        List<Float> s =  studentList.stream()  
                            .filter(p -> p.perct < 33) // filtering data  
                            .map(Details::getPerct)         // fetching percentage by referring getPerct method  
                            .collect(Collectors.toList());  // collecting as list   
        System.out.println("The failed students are: "+s);  
      
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Amitabh");
        studentNames.add("Shekhar");
        studentNames.add("Aman");
        studentNames.add("Rahul");
        studentNames.add("Shahrukh");
        studentNames.add("Salman");
        studentNames.add("Yana");
        studentNames.add("Lokesh");
        System.out.println(studentNames);
        boolean matched = studentNames.stream()
                .anyMatch((Details) -> Details.startsWith("S"));
         
        System.out.println(matched);
        String firstMatchedName = studentNames.stream()
                .filter((Details) -> Details.startsWith("S"))
                .findFirst()
                            .get();
     
    System.out.println(firstMatchedName);
    Optional<String> reduced = studentNames.stream()
            .reduce((s1,s2) -> s1 + "#" + s2);
     
    reduced.ifPresent(System.out::println);
    }
}