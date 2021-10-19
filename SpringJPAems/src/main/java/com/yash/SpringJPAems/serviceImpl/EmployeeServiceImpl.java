package com.yash.SpringJPAems.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.SpringJPAems.dao.EmployeeDao;
import com.yash.SpringJPAems.entities.Employee;
import com.yash.SpringJPAems.service.EmployeeService;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{

		@Autowired
		EmployeeDao employeeDao;
		
	
	public int insert(Employee employee) {
		employeeDao.insert(employee);
		return 0;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	@Override
	public int update(Employee employee) {
		employeeDao.update(employee);
		return 0;
	}

	@Override
	public int delete(int Id) {
		employeeDao.delete(Id);
		return 0;
	}

	@Override
	public List<Employee> getEmpById(int Id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmpById(Id);
	}

	@Override
	public List<Employee> getEmpByName(String Name) {
		// TODO Auto-generated method stub
		return employeeDao.getEmpByName(Name);
	}

}
