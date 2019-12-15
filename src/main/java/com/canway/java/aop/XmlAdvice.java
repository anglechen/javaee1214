package com.canway.java.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class XmlAdvice {

	
	public void doBefore() {
		System.out.println("这里是aop的前置before通知");
	}
	
	public void doAfter() {
		System.out.println("这里是aop的后置after通知");
	}
	
	public Object doAroud(ProceedingJoinPoint point) throws Throwable {
		System.out.println("====================");
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		System.out.println("这里是aop的环绕aroud通知");
		long end = System.currentTimeMillis();
		System.out.println("aop方法执行时间： " + (end - start));
		return result;
	}
}
