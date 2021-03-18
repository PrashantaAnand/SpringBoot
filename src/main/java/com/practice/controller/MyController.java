package com.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about",method =RequestMethod.GET)
	public String about(Model model)
	{
		model.addAttribute("name","Prashant Anand");
		model.addAttribute("current","anand");
		System.out.println("inside about handler");
		return "about";
	}
	
	@GetMapping("/looping")
	public String looping(Model model)
	{
		List<String> names = List.of("Ankit","prashnat","hshd","jsdhfds");
		model.addAttribute("names",names);
		return "looping";
	}
	
	@GetMapping("/condition")
	public String condition(Model model)
	{
		model.addAttribute("isactive","true");
		model.addAttribute("gender","F");
		
	 List<Integer> list = List.of(222,223,343,454,54);
	 model.addAttribute("mylist",list);
		System.out.println("conditional statement executed");
		return "condition";
	}
	
	@GetMapping("/service")
     public String services()
     {
    	 
    	 return "service";
     }
	@GetMapping("/new")
	public String newAbout()
	{
		return "aboutnew";
	}

	@GetMapping("/contact")
	public String newAbout1 ()
	{
		return "contact";
	}

}
