package com.yash.demohiber;



import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "employee1")
public class Employee 
{
 	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String name;
    String phone;
    String location;
    double salary;
    
    @Embedded
    EmpAddress empAddress;

	public EmpAddress getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}

	public Employee() {
		
	}
	
	public Employee(int id, String name, String phone, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", location=" + location + ", salary="
				+ salary + "]";
	}
	
	
	
	
}
