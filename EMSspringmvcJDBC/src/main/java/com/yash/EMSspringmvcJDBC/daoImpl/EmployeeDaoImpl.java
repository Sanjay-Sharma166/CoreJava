package com.yash.EMSspringmvcJDBC.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.yash.EMSspringmvcJDBC.dao.EmployeeDao;
import com.yash.EMSspringmvcJDBC.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

		private JdbcTemplate jdbcTemplate; 
		@Autowired
		public EmployeeDaoImpl(DataSource dataSource)
		{
			jdbcTemplate = new JdbcTemplate(dataSource); 
		}

		@Override
		public int insert(Employee employee) 
		{
			//insert
			String query="insert into employee(Id,Name,City,Salary,Designation) values(?,?,?,?,?)";
			int r= this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getCity(),employee.getSalary(),employee.getDesignation());
			return 0;
		}

		@Override
		public int update(Employee employee) {
			//update
			String query="update employee set Name=?, City=?, Salary=?, Designation=? where Id=?";
			int r=this.jdbcTemplate.update(query,employee.getName(),employee.getCity(),employee.getSalary(),employee.getDesignation(),employee.getId());
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
		
	/*public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	*/

	

	
	

}
