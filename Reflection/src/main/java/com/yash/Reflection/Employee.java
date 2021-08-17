package com.yash.Reflection;

import java.io.Serializable;

public class Employee extends Object implements Serializable, Cloneable{
  private int id;
  private String name;
  private String address;
	
  private Employee()
  {
	  super();
  }
  
  public Employee(int id, String name, String address)
  {
	  super();
	  this.id=id;
	  this.name=name;
	  this.address=address;
  }
  
  public void add()
  {
	  
  }
  public void searchEmployee(int id)
  {
	  
  }
}

