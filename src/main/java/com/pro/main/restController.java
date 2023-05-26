package com.pro.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

	@RequestMapping("/main2")
	public String main2() {
		System.out.println("main2Mapping");
		
		return "/main";
	}
	
}
