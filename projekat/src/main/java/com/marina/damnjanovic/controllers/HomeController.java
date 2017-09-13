package com.marina.damnjanovic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome(){
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	
	@RequestMapping("/internships")
	public String internships(){
		return "internships";
	}
	
	@RequestMapping("/internship_item")
	public String internshipItem(){
		return "internships_item";
	}
}