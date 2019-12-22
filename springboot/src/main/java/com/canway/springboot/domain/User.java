package com.canway.springboot.domain;


import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class User  implements Serializable{
	
	private Integer id;
	
	@NotNull(message = "用户名不能为空")
	private String name;
	
	private String userName;
	
	@NotNull(message = "年龄不能为空")
	@Range(max = 100,min = 18,message = "年龄只能在18-100之间")
	private Integer age;
	
	private String sex;
	
}
