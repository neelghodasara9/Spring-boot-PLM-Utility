package com.java.plm.MyWebApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String index() {
		return "neel";
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		System.out.println("in post hello");
		model.addAttribute("name", name);

		//model.addAttribute("List", new String[] { "Site Id", "Site Code" , "Campaign Code","PLM Discount id", "PLM Start Date", "PLM End Date", "ICOMS Start Date", "ICOMS End Date", "Offer series", "Comments" } );

		return "hello";
	}
}
