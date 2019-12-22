package com.canway.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@Api("登录接口")
public class LoginController {
	
	
	
	@RequestMapping("/login")
	@ApiOperation(value = "登录请求" ,notes = "根据用户名密码进行登录验证")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "name",value = "",required = true),
		@ApiImplicitParam(name = "password",value = "",required = true)
	})
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
