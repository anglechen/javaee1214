package com.canway.java.aop;

import java.io.Serializable;

import lombok.Data;


@Data
public class ResultJson implements Serializable {
	
	
//	状态码
	private int code;
	
//	提示信息
	private String message;
	
	
//	业务数据
	private Object data;
	
	public ResultJson(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	
	
	public static ResultJson returnSuccess(Object data) {
		return new ResultJson(200,"",data);
	}
	
	public static ResultJson returnError(int code, String message) {
		return new ResultJson(code,message,"");
	}
	
	
	
	
	

}
