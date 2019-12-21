package com.canway.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.canway.web.domain.User;
import com.canway.web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/insert")
	@ResponseBody
	public String insert(User user) {
		
		userService.insertSelective(user);
		
		JSONObject json = new JSONObject();
		json.put("result", "success");
		
		
		return json.toJSONString();
		
	}
	
	
	
	@RequestMapping("/select")
	@ResponseBody
	public String select(int id) {
		
		User user = userService.selectByPrimaryKey(id);
		
		JSONObject json = new JSONObject();
		json.put("result", "success");
		json.put("data", user);
		
		
		return json.toJSONString();
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int id) {
		
		userService.deleteByPrimaryKey(id);
		
		JSONObject json = new JSONObject();
		json.put("result", "success");
		
		
		return json.toJSONString();
		
	}
	
	
	

}
