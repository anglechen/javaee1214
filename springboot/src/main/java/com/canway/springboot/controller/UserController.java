package com.canway.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.canway.springboot.domain.User;
import com.canway.springboot.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/index")
	public String page() {
		return "user/list";
	}
	
	
	@GetMapping
	@ResponseBody
	@Cacheable("selectAll")
	public String selectAll(User user) {
		List<User> users = userService.selectAll(user);
		JSONObject json = new JSONObject();
		json.put("data", users);
		return json.toJSONString();
		
	}
	
	@PostMapping("/delete")
	@ResponseBody
	public String delete(String ids) {
		String[] userIds = ids.split(",");
		for(String id : userIds) {
			userService.deleteByPrimaryKey(Integer.parseInt(id));
		}
		JSONObject json = new JSONObject();
		json.put("data", "");
		return json.toJSONString();
		
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String insert(@Valid User user ,BindingResult results) {
		
		JSONObject json = new JSONObject();
		while (results.hasErrors()) {
			String errors = "";
			for (ObjectError e : results.getAllErrors()) {
				errors += e.getObjectName() +"," + e.getDefaultMessage();
				System.out.println(e.getObjectName() +"," + e.getDefaultMessage());
			}
			
			json.put("result", "error");
			json.put("error", errors);
			return json.toJSONString();
		}
		
		userService.insertSelective(user);
		
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
	
	
	@RequestMapping("/error")
	@ResponseBody
	public String testException() {
		throw new RuntimeException("出错了");
	}
	
	
	
	
	

}
