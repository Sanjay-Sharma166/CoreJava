package com.yash.Springdatajpa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yash.Springdatajpa.model.Employee;
import com.yash.Springdatajpa.repository.EmployeeRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeRepositorytest 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	@Rollback(true)
	@Transactional
	public void testsaveemployee()
	{
		Employee e = new Employee("sanjay","Ujjain",25000.00,"Trainee");
		employeeRepository.save(e);
		assertThat(employeeRepository.findAll().size()).isGreaterThan(0);			
	}
	
	@Test
	@Rollback(true)
	@Transactional
	public void testfindallemployee()
	{
		Employee e = new Employee("Navin","Ujjain",25000.00,"Trainee");
		Employee p = new Employee("Sanjya","Ujjain",25000.00,"Trainee");
		Employee t = new Employee("Ravi","Ujjain",25000.00,"Trainee");
		//employeeRepository.save(e);
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(e);
		employees.add(p);
		employees.add(t);
		employeeRepository.saveAll(employees);		
		assertThat(employeeRepository.findAll().size()).isEqualTo(employees.size());
	}
	
	@Test
	@Rollback(true)
	@Transactional
	public void testdeleteemployee()
	{
		Employee t = new Employee("Ravi","Ujjain",25000.00,"Trainee");
		employeeRepository.save(t);
		assertThat(employeeRepository.findAll().size()).isGreaterThan(0);	
		employeeRepository.delete(t);
		assertThat(employeeRepository.findAll().size()).isEqualTo(0);	
	}
}
