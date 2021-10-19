package com.yash.SpringJPAems.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.SpringJPAems.entities.Employee;

public class RowMapperImpl  implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee= new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setCity(rs.getString(3));
		employee.setSalary(rs.getDouble(4));
		employee.setDesignation(rs.getString(5));
		return employee;
	}

}
