package com.jspider.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

////@Component
@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("/")
	public String welcomeFile() {
		System.out.println("welcome file of controller");
		return "index";
	}
@RequestMapping(value = "register.htm",method=RequestMethod.POST)
	public String register(HttpServletRequest req) {
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String rollno = req.getParameter("rollno");
		String address = req.getParameter("address");
		System.out.println("Name" + name);
		System.out.println("Id" + id);
		System.out.println("RollNo" + rollno);
		System.out.println("Address" + address);
		return "welcome";
	}
}
