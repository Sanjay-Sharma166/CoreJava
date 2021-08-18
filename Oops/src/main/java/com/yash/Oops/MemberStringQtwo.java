package com.oops;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class MemberStringQtwo {

	private String firstname;
	private String lastname;
	private String email; 
	private String password;
	private String role;

	//Getter
	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	public String getRole() {
		return role;
	}

	//Setter

	public String setFirstName(String f) 
	{
		return this.firstname = f;
	}

	public String setLastName(String l) 
	{
		return this.lastname = l;
	}
	public String setEmail(String e) 
	{
		return this.email = e;
	}

	public String setPassword(String p) 
	{
		return this.password = p;
	}
	public String setRole(String r)
	{
		return this.role = r;
	}

	public void showDocumentInformation(String firstname, String lastname,String email,String password,String role) 
	{
		System.out.println(firstname);
		System.out.println(lastname);	
		System.out.println(email);	
		System.out.println(password);	
		System.out.println(role);	
		
	}

	public static void main(String[] args) 
	{
		String a,b,c,d,e;

		MemberStringQtwo d1 = new MemberStringQtwo();
		a = d1.setFirstName("employee firstname: Pankaj ");
		b = d1.setLastName("employeelastname: Sharma");
		c = d1.setEmail("email :sharma.pankaj@yash.com");
		d = d1.setPassword("12345");
		e = d1.setRole("Trainer");
		d1.showDocumentInformation(a,b,c,d,e);

	}


}
