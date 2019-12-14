/**
 *
 */
package com.canway.java.model;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author aubrey
 * @date  上午11:51:56
 * 
 */
//@Data
//@Component
public class People {
	
	private String name;
	
	private Integer age;

	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public People() {
		
		
	}
	
	
	public People(String name) {
		this.name = name;
		
	}
	
	
	public void test() {
		System.out.println("hello this is a peopel");
	}
	
	
}
