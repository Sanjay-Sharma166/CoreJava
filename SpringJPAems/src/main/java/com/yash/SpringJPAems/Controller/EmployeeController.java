package com.yash.SpringJPAems.Controller;

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

import com.yash.SpringJPAems.dao.EmployeeDao;
import com.yash.SpringJPAems.daoImpl.EmployeeDaoImpl;
import com.yash.SpringJPAems.entities.Employee;
import com.yash.SpringJPAems.service.EmployeeService;

@Controller
public class EmployeeController
{
		@Autowired
		EmployeeService employeeService; 
	
			@GetMapping("view")
			public ModelAndView getAllEmployee(ModelMap model)
			{
				List<Employee> list = employeeService.getAllEmployee();
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
			employeeService.insert(employee);
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
			employeeService.update(employee);
			return "updatesuccess";
		}
		
		@GetMapping("delete")
		public String deleteRedirect(@RequestParam("id")int Id)
		{
			employeeService.delete(Id);
			return "delsuccess";
		}
		
		@GetMapping("EmpId")
		public String EmpIdRedirect()
		{
			return "EmpId";
		}
		
		@GetMapping("employeeById")
		public ModelAndView ByIdRedirect(@RequestParam("Id")int Id)
		{
			List<Employee> list = employeeService.getEmpById(Id);
			ModelAndView model = new ModelAndView("ById");
			model.addObject("List", list);
			return model;
		}
		
		@GetMapping("EmpName")
		public String EmpNameRedirect()
		{
			return "EmpName";
		}
		
		@GetMapping("ByName")
		public ModelAndView ByNameRedirect(@RequestParam("Name")String Name)
		{
			List<Employee> list = employeeService.getEmpByName(Name);
			ModelAndView model = new ModelAndView("ByName");
			model.addObject("List", list);
			return model;
		}
}