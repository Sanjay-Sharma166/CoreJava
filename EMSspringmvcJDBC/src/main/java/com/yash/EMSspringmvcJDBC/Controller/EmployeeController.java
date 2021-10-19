package com.yash.EMSspringmvcJDBC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.EMSspringmvcJDBC.dao.EmployeeDao;
import com.yash.EMSspringmvcJDBC.daoImpl.EmployeeDaoImpl;
import com.yash.EMSspringmvcJDBC.entities.Employee;

@Controller
public class EmployeeController
{
		@Autowired
		EmployeeDaoImpl employeeDaoImpl; 
		
		@GetMapping("view")
		public ModelAndView getAllEmployee(ModelMap model)
		{
			List<Employee> list = employeeDaoImpl.getAllEmployee();
			ModelAndView mv= new ModelAndView("welcome");
			mv.addObject("List", list);
		return mv;
		}
		
		@GetMapping("form")
		public ModelAndView formRedirect()
		{
			return new ModelAndView("employeeform","employee",new Employee());
		}
		
		@PostMapping("save")
		public ModelAndView update(@ModelAttribute Employee employee)
		{	
			System.out.println(employee);
			employeeDaoImpl.insert(employee);
			return new ModelAndView("success");
		}
		
		@GetMapping("home")
		public String homeRedirect()
		{
			return "home";
		}
		
		@GetMapping("update")
		public ModelAndView updateformredirect()
		{
			return new ModelAndView("updateform","employee", new Employee());
		}
	
		@PostMapping("updateemp")
		public String updateempRedirect(@ModelAttribute("employee")Employee employee)
		{
			employeeDaoImpl.update(employee);
			return "updatesuccess";
		}
		
		@GetMapping("delete")
		public String deleteRedirect(@RequestParam("id")int Id)
		{
			employeeDaoImpl.delete(Id);
			return "delsuccess";
		}
	
}