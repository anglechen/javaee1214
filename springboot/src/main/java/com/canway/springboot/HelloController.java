package com.canway.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HelloController {
	
	@RequestMapping("/hello")
//	@ResponseBody
	public String hello() {
		return "hello world";
	}
	
	
	@RequestMapping("/test")
	public String test() {
		return "hello world ,this is a test; devtools 测试";
	}
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","1111111");
        return "hello";
    }
	
	@RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public String showJsp(Model model){
        return "hello";
    }

}
