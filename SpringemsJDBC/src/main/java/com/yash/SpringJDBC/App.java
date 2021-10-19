package com.yash.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.SpringJDBC.dao.EmployeeDao;
import com.yash.SpringJDBC.entities.Employee;
import com.yash.SpringemsJDBC.Configuration.JdbcConfig;


/**
 * 
 * @author sanjay.sharma
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My Program Started . . .");
    	//spring JDBC-JDBCTemplate
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);									
		EmployeeDao EmployeeDao =context.getBean("EmployeeDao", EmployeeDao.class);
		
		 
		 //Insert
		Employee Employee=new Employee();
		Employee.setId(5);
		Employee.setName("Chaman");
		Employee.setCity("Kolkata");
		
		int result= EmployeeDao.insert(Employee);
		System.out.println("Student Added!!" +result);
		
		
		/*
		//Update
		Employee Employee=new Employee();
		Employee.setId(4);
		Employee.setName("Kunal");
		Employee.setCity("Hyderabad");
		
		int result=EmployeeDao.update(Employee);
		System.out.println("Student Updated!!" +result);
		*/
		
		/*
		//delete
		int result=EmployeeDao.delete(4);
		System.out.println("Record Deleted!!" +result);
		*/
		
		List<Employee> Employees = EmployeeDao.getAllEmployee();
		System.out.println("List of Employees :");
		for(Employee e: Employees)
		{
			//System.out.println("List of Employees :");
			System.out.println(e);
		}
    }
}
