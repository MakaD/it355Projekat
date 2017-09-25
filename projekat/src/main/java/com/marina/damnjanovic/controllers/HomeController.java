package com.marina.damnjanovic.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marina.damnjanovic.data.models.AdModel;
import com.marina.damnjanovic.data.services.AdService;

@Controller
public class HomeController {
	
	@Autowired
	private AdService adService;
	
	@Autowired
	public void setAdService(AdService adService) {
        this.adService = adService;
    }

	@RequestMapping("/")
	public String goHome(){
		return "home";
	}
	
	@RequestMapping("/home")
	public String backHome(){
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
	
	/*
	@RequestMapping("/table")
	public String tableEmpty(){
		return "table";
	}
	*/

	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public List<AdModel> table(){
		
		List<AdModel> list = new ArrayList<AdModel>();

		//return this.adService.listAds();
		return list;
	}
}