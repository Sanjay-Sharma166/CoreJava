package com.yash.Springmvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloWorldController
{
		@RequestMapping(value="hello", method=RequestMethod.GET)
		public String sayHelloWorld(ModelMap model){
		model.addAttribute("greeting","Hi! Hello From Spring MVC");
		return "welcome";
		}
		@RequestMapping(value="helloagain", method=RequestMethod.GET)
		public String sayHelloWorldAgain(ModelMap model){
		model.addAttribute("greeting", "Hi! Again Hello from Spring MVC");
		return "welcome";
		}
}