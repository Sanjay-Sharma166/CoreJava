package com.yash.SpringORM.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yash.SpringORM.entities.Employee;

public class EmployeeDao
{
	public HibernateTemplate hibernateTemplate;
	
	//save employee
	@Transactional
	public int insert(Employee employee)
	{
		//insert
		Integer i=(int)this.hibernateTemplate.save(employee);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
