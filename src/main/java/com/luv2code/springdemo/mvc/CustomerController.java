package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
//org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder webdata) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		webdata.registerCustomEditor(String.class,trimmer);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form"; }
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
								BindingResult theBindingResult) {
		
		System.out.println("Last Name : |" + theCustomer.getLastName()+" | ");
		if(theBindingResult.hasErrors()) {
			
			return "customer-form";
		}							
		else {							
		return "customer-confirmation";	}						
  }
	
	
	
	 }



