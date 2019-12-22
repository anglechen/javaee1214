package com.canway.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.canway.web.domain.User;
import com.canway.web.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/user")
@Api("用户相关请求接口")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/index")
	public String page() {
		return "user/list";
	}
	
	
	@GetMapping
	@ResponseBody
	@ApiOperation(value = "查询所有",notes = "根据用户信息查看用户记录")
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
