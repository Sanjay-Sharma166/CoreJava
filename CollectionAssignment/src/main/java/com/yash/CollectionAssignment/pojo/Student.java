package com.yash.CollectionAssignment.pojo;

public class Student
{
	public long id;
	public String name;
	public String standard;
	
	public Student(long id, String name, String standard)
	{
		this.id=id;
		this.name=name;
		this.standard=standard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
	

}
