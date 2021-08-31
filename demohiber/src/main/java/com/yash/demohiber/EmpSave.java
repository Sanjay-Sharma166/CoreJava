package com.yash.demohiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpSave {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		
		EmpAddress e1=new EmpAddress();
		e1.setCurrentaddress("Chhawni");
		e1.setPermanentaddress("Agar");
		
		 Employee emp1=new Employee();
		 // emp1.setId(1);
		  emp1.setLocation("Agar");
		  emp1.setName("mohan");
		  emp1.setPhone("98732");
		  emp1.setSalary(25798.00);
		  emp1.setEmpAddress(e1);
		  
		  s.save(emp1);
		 //s.update(emp1);
		 //s.delete(emp1);
		  
		Employee emp=new Employee();
		emp=(Employee)s.get(Employee.class, 1);
		System.out.println(emp.getId()+emp.getName());
		System.out.println("done..!!");
		t.commit();
		sf.close();
		
	}
}
