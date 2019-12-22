package com.canway.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.canway.web.domain.User;

@Controller
public class TestController {
	
	
//	@RequestMapping(value = "/test",method = RequestMethod.GET)
	@GetMapping("/test")
//	PostMapping
	@ResponseBody  //表示直接返回的是数据json
	public String test( @Valid User user,BindingResult result) {
		
		
		/* 调用业务逻辑 */
		while(result.hasErrors()) {
			for(ObjectError e : result.getAllErrors()) {
				System.out.println(e.getObjectName() + ":" + e.getDefaultMessage());
			}
			return "error";
		}
		
		
		return "test";
	}
	
	@RequestMapping("/static/layer/layer.js")
	public String loginPage() {
//		/WEB-INF/jsp/login.jsp
		return "login";
	}
	
	
	
	
	
	
	
}
