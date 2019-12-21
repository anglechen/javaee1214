package com.canway.web.domain;


import java.io.Serializable;

import lombok.Data;

@Data
public class User  implements Serializable{
	
	private Integer id;
	private String name;
	private String userName;
	private Integer age;
	private String sex;
	
}
