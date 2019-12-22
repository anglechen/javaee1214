package com.canway.web.domain;


import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户的实体信息" ,value = "users")
public class User  implements Serializable{
	
	@ApiModelProperty("id用户的曾用名")
	private Integer id;
	
	@NotNull(message = "用户名不能为空")
	@ApiModelProperty("用户名的曾用名")
	private String name;
	
	@ApiModelProperty("用户的曾用名")
	private String userName;
	
	@NotNull(message = "年龄不能为空")
	@Range(max = 100,min = 18,message = "年龄只能在18-100之间")
	@ApiModelProperty("用户的年龄")
	private Integer age;
	
	@ApiModelProperty("用户的性别")
	private String sex;
	
}
