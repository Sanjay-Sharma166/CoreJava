package com.yash.SpringemsJDBC.Configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.SpringJDBC.dao.EmployeeDao;
import com.yash.SpringJDBC.dao.EmployeeDaoImpl;

@Configuration
public class JdbcConfig 
{
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("EmployeeDao")
	public EmployeeDao getEmployeeDao()
	{
		EmployeeDaoImpl employeeDao=new EmployeeDaoImpl();
		employeeDao.setJdbcTemplate(getTemplate());
		return employeeDao;
		
		
	}
}
