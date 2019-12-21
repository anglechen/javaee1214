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
		
		/* 查询 */
//		user.setName("'22' or 1=1");
//		user.setName("11");
//		user.setAge(1);
		
		long start = System.currentTimeMillis();
		List<User> results = userMapper.selectAll(user);
		for(User u : results) {
			System.out.println(u);
		}
		for(int i = 0; i< 10 ; i++) {
			userMapper.selectAll(user);
			System.out.println("正在执行第：" + (i+1) +" 次usermapper的调用");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("11次数据库查询一共发费了：" +(end - start ) + " 毫秒");
		
		/* 新增数据 */
//		user.setName("4441");
//		user.setUserName("4441");
//		user.setAge(4);
//		user.setSex("man");
//		userMapper.insert(user);
		
		
		
//		更新数据
		user.setName("6666666");
//		user.setUserName("testusername");
//		user.setAge(88);
//		user.setId(2);
//		userMapper.update(user);
		
		
//		删除数据
//		userMapper.delete(4);
//		userMapper.delete(5);
		
		
		
		
	}

}
