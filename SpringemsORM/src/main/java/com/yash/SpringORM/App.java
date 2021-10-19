package com.yash.SpringORM;

import org.hibernate.tool.schema.internal.exec.JdbcContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringORM.dao.EmployeeDao;
import com.yash.SpringORM.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");								
    		EmployeeDao employeeDao=context.getBean("employeeDao",EmployeeDao.class);
    		Employee employee=new Employee(1,"Sanjay","Ujjain");
    		int r= employeeDao.insert(employee);
    		System.out.println("!! done !!"+r);
    }
}
