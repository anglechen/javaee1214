package com.canway.java.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAnnotationAdvice {
	
//	@Pointcut("execution(* com.canway.java.aop.Auto*.*(..))")
	@Pointcut("@annotation(com.canway.java.aop.annotation.LogAnnotation)")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void doBefore(JoinPoint joinpoint) {
		
		System.out.println("这里是注解形式的aop...................");
	}

}
