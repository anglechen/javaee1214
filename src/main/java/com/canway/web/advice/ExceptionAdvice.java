package com.canway.web.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.canway.java.aop.ResultJson;

@ControllerAdvice
public class ExceptionAdvice {
	
	
	@ResponseBody
	@ExceptionHandler({Exception.class})
	public String requestException(Exception ex) {
		System.out.println("error.............");
		ex.printStackTrace();
		ResultJson resultJson = new ResultJson(500, "出异常了，请联系管理员", "");
		return JSONObject.toJSONString(resultJson);
	}
}
