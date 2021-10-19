package com.yash.SpringJPAems.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.yash.SpringJPAems.dao.EmployeeDao;
import com.yash.SpringJPAems.entities.Employee;


@Component
public class EmployeeDaoImpl implements EmployeeDao{
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public int insert(Employee employee) {
		entityManager.persist(employee);
		return 0;
	}

	@Override
	public int update(Employee employee) {
		entityManager.merge(employee);
		return 0;
	}

	@Override
	public int delete(int Id) {
		entityManager.remove(entityManager.find(Employee.class, Id));
		return 0;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>)entityManager.createQuery("from Employee").getResultList();
	}

	@Override
	public List<Employee> getEmpById(int Id) {
		Employee emp= entityManager.find(Employee.class, Id);
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(emp);
		return employee;
	}

	@Override
	public List<Employee> getEmpByName(String Name) {
		List<Employee> emp = (List<Employee>)entityManager.createQuery("from Employee").getResultList();
		List<Employee> empl=new ArrayList<Employee>();
		for(Employee e:emp)
		{
			if(e.getName().equals(Name))
			{
				empl.add(e);
			}
		}
		return empl;
	}
	
		
	

}