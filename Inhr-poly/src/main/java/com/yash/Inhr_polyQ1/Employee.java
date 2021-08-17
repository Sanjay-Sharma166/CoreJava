package com.yash.Inhr_polyQ1;

public class Employee extends Person
{
	double salary;
	int startingYear;
	String insuranceNumber;
	
	public Employee(String name,double salary, int startingYear, String insuranceNumber )
	{
		super(name);
		this.salary=salary;
		this.startingYear=startingYear;
		this.insuranceNumber=insuranceNumber;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getstartingYear()
	{
		return startingYear;
	}
	public void setstartingYear(int startingYear)
	{
		this.startingYear=startingYear;
	}
	public String getinsuranceNumber()
	{
		return insuranceNumber;
	}
	public void setinsuranceNumber(String insuranceNumber)
	{
		this.insuranceNumber=insuranceNumber;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", startingYear=" + startingYear + ", insuranceNumber=" + insuranceNumber + "]";
	}
	
}
