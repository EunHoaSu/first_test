package com.pro.eun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class proMainController {

	@RequestMapping("/th")
	public String proMain(Model model) {
		System.out.println("proMainMapping");
		
        
        String test = "test";
        model.addAttribute(test, test);
		
		return "th/main.html";
	}
	
	@RequestMapping("/jsp")
	public String proMain2(Model model) {
		System.out.println("proMainMapping");
		
		
		String test = "test";
		model.addAttribute(test, test);
		
		return "/main/main";
	}

}
