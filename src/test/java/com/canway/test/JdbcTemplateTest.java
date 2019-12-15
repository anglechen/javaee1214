package com.canway.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.canway.java.model.User;

public class JdbcTemplateTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		User user = (User) jdbcTemplate.queryForObject("select * from user where id = 1", new BeanPropertyRowMapper(User.class));
		System.out.println(user);
	}
}
