package com.yash.String.Assignment;

public class Employee 
{
	private String firstName;
	private String lastName;
	private String company;
	private String role; 

	public void setFirstName(String firstName) 
	{
    		this.firstName=firstName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}


	public void setLastName(String lastName) 
	{
    		this.lastName=lastName;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	

	public void setCompany(String company) 
	{
    		this.company=company;
	}

	public String getCompany()
	{
		return this.company;
	}


	public void setRole(String role) 
	{
    		this.role=role;
	}

	public String getRole()
	{
		return this.role;
	}

	public String printData() 
	{
        	return "name: "+getFirstName()+" "+getLastName()+"\nCompany: "+getCompany()+"\nRole: "+getRole();
    	}

	public String generatePassword()
	{
		return "Generated Password: "+getFirstName().substring(0,2)+""+getLastName().substring(0,2)+""
			+getCompany().substring(0,2)+""+getRole().substring(0,2);
	}
	public static void main(String args[])
	{
		Employee obj = new Employee();
		obj.setFirstName("pankaj");
		obj.setLastName("sharma");
		obj.setCompany("yash");
		obj.setRole("trainer");
		System.out.println(obj.printData());
		System.out.println(obj.generatePassword());
	}

}
