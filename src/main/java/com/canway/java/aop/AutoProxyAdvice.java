package com.canway.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.canway.java.aop.annotation.LogAnnotation;

//@Component
//@Aspect
public class AutoProxyAdvice {
	
	@Pointcut("execution(* com.canway.java.aop.Auto*.*(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void doBefore(JoinPoint joint) {
		Object[] args = joint.getArgs();
		System.out.println("这里是aop的前置before通知");
	}
	
	
	@After("pointcut()")
	public void doAfter() {
		System.out.println("这里是aop的后置after通知");
	}
	
	@Around("pointcut()")
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
