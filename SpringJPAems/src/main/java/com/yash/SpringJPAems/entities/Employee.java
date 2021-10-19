package com.yash.SpringJPAems.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="employees")
public class Employee {
		
		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Id;
		private String Name;
		private String City;
		private double Salary;
		private String Designation;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int id, String name, String city, double salary, String designation) {
			super();
			Id = id;
			Name = name;
			City = city;
			Salary = salary;
			Designation = designation;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public double getSalary() {
			return Salary;
		}

		public void setSalary(double salary) {
			Salary = salary;
		}

		public String getDesignation() {
			return Designation;
		}

		public void setDesignation(String designation) {
			Designation = designation;
		}

		@Override
		public String toString() {
			return "Employee [Id=" + Id + ", Name=" + Name + ", City=" + City + ", Salary=" + Salary + ", Designation="
					+ Designation + "]";
		}
		
		
		
}
