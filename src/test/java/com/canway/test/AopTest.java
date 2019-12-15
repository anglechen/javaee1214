package com.canway.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canway.java.aop.BaseAop;
import com.canway.java.aop.BaseAopInterface;

public class AopTest {

	@Test
	public void aopBeforetest() throws InterruptedException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
		BaseAopInterface  baseAop = (BaseAopInterface) applicationContext.getBean("baseAop");
		baseAop.add();
		System.out.println("============");
		baseAop.mod();
	}

}
