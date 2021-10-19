package com.yash.Springdatajpa.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.Springdatajpa.model.Employee;
import com.yash.Springdatajpa.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController  //show how application going to work
@RequestMapping("/api") 
public class EmployeeController
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")//http://localhost:8080/api/employees
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
      try {
        List<Employee> employees = new ArrayList<Employee>();
        if (name == null)
          employeeRepository.findAll().forEach(employees::add);
        else
            employeeRepository.findByName(name).forEach(employees::add);
        if (employees.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employees, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		List<Employee> employees = employeeRepository.findAll();
		return new ResponseEntity<>(employees, HttpStatus.OK );	
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		List<Employee> employees = employeeRepository.findAll();
		return new ResponseEntity<>(employees, HttpStatus.OK );	
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public ResponseEntity<List<Employee>> deleteEmployee(@RequestParam("id")int id)
	{	
		employeeRepository.deleteById(id);
		List<Employee> employees = employeeRepository.findAll();
		return new ResponseEntity<>(employees, HttpStatus.OK );	
	}
	
	@RequestMapping(value="/getById",method=RequestMethod.GET)
	public ResponseEntity<Employee> getByIdEmployee(@RequestParam("id")int id)
	{
		return new ResponseEntity<>(employeeRepository.findById(id).get(), HttpStatus.OK );	
	}
	
}
