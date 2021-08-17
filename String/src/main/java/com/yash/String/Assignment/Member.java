package com.yash.String.Assignment;

import com.yash.String.Assignment.Member;

public class Member
{
	static String firstname;
	static String lastname;
	static String email;
	static long password;
	static String role;
	
	void setDetail(String firstname,String lastname,String email,long password,String role)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		this.role=role;
	}
  void getDetail()
	{
		System.out.println("The details were:Firstname- "+firstname+"  Lastname- "+lastname+"  Email- "+email+"  Password- "+password+"  Role- "+role);
	}
	static String showMemberDetail()
	{
		String s = "Firstname"+firstname+"Lastname" +lastname+ "Email" +email+ "Password"+password+ "Role" +role; 
		return s;
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		m.setDetail("Pankaj", "Sharma","sharma.pankaj@yash.com",12345,"Trainer");
		m.getDetail();
	}

}
