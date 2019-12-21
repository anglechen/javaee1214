package com.canway.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
//	@RequestMapping(value = "/test",method = RequestMethod.GET)
	@GetMapping("/test")
//	PostMapping
	@ResponseBody  //表示直接返回的是数据json
	public String test() {
		
		
		/* 调用业务逻辑 */
		
		
		
		return "test";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
//		/WEB-INF/jsp/login.jsp
		return "login";
	}
	
	
	
	
	
	
	
}
