package com.pro.eun.main.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.eun.main.service.TestService;
import com.pro.eun.main.service.TestVO;

import jakarta.annotation.Resource;


@Controller
public class ProTestController {

	@Resource(name = "testService")
	private TestService testService;
	
	@RequestMapping("/th/test.do")
	public String proMain(Model model) {
		
		
		List<TestVO> testList = testService.selectTest();
		
		System.out.println("proMainMapping");
		
        
        String test = "test2";
        model.addAttribute("test", test);
        model.addAttribute("testList", testList);
		
		return "th/main.html";
	}

}
