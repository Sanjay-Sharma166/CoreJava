package com.yash.SpringJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.SpringJDBC.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

		private JdbcTemplate jdbcTemplate; 
			

		@Override
		public int insert(Employee employee) 
		{
			//insert
			String query="insert into employee(Id,Name,City) values(?,?,?)";
			int r= this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getCity());
			return 0;
		}

		@Override
		public int update(Employee employee) {
			//update
			String query="update employee set Name=?, City=? where Id=?";
			int r=this.jdbcTemplate.update(query,employee.getName(),employee.getCity(),employee.getId());
			return r;
		}
		
		@Override
		public int delete(int Id) {
			//delete
			String query="delete from employee where Id=?";
			int r=this.jdbcTemplate.update(query,Id);
			return 0;
		}

		@Override
		public List<Employee> getAllEmployee() {
			// get all employee
			String query="select * from employee";
			List<Employee> Employees=this.jdbcTemplate.query(query, new RowMapperImpl());
			return Employees;
		}
		
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	

}
