package com.canway.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	
	@RequestMapping("/login")
	public String login(String name, String password,HttpServletRequest request) {
		
		if("admin".equals(name)  && "admin".equals(password)) {
			System.out.println("用户名和密码正确，登录成功");
			HttpSession session =  request.getSession();
			session.setAttribute("name", "admin");
			
			return "index";
		}else {
			return "redirect:/login.jsp";
		}
		
		
	}

}
