package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showform() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processform() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersion2")
	public String letShoutoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName= theName.toUpperCase();
		
		String result = "YO! " +theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String letShoutoutDude(@RequestParam ("studentName") String theName, Model model) {
	
		theName= theName.toUpperCase();
		
		String result = "This is Version 3 of " +theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
