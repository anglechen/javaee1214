package com.canway.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canway.web.domain.User;
import com.canway.web.mapper.UserMapper;

public class MybatisTest {
	
	@Test
	/*
	 * public void testMybatisSpring() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("application-simple.xml"); UserMapper
	 * userMapper = context.getBean(UserMapper.class); List<User> results =
	 * userMapper.selectAll(); for(User u : results) { System.out.println(u); } }
	 */
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-simple.xml");
		UserMapper userMapper = context.getBean(UserMapper.class);
		System.out.println(userMapper);
		User user = new User();
//		user.setId(1);
//		User result = userMapper.selectById(user);
//		System.out.println(result);
		
		user.setName("'22' or 1=1");
		List<User> results = userMapper.selectByName(user);
		for(User u : results) {
			System.out.println(u);
		}
	}

}
