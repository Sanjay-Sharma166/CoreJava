package com.yash.Inhr_polyQ4;

import java.util.Arrays;

public class StudentApp {

	public static void main(String[] args) {
         Student[] students=new Student[11];
         Student s1=new Student();
         s1.setInfo("XYZ",12, "Ujjain");
         Student s2=new Student();
         s2.setInfo("XYZ",12, "Ujjain");
         Student s3=new Student();
         s3.setInfo("XYZ",12, "Ujjain");
         Student s4=new Student();
         s4.setInfo("XYZ",12, "Ujjain");
         Student s5=new Student();
         s5.setInfo("XYZ",12, "Ujjain");
         Student s6=new Student();
         s6.setInfo("XYZ",12, "Ujjain");
         Student s7=new Student();
         s7.setInfo("XYZ",12, "Ujjain");
         Student s8=new Student();
         s8.setInfo("XYZ",12, "Ujjain");
         Student s9=new Student();
         s9.setInfo("XYZ",12, "Ujjain");
         Student s10=new Student();
         s10.setInfo("XYZ",12, "Ujjain");
         Student s11=new Student();

         students[0]=s1;
         students[1]=s2;
         students[2]=s3;
         students[3]=s4;
         students[4]=s5;
         students[5]=s6;
         students[6]=s7;
         students[7]=s8;
         students[8]=s9;
         students[9]=s10;
         students[10]=s11;
   System.out.println(Arrays.toString(students));
	}

}
