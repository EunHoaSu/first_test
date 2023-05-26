package com.pro.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	public static void voidMain() {
		System.out.println("MAIN===================");
		
	}
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("mainMapping");
		
		return "/main";
	}

}
