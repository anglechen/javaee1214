package com.canway.java.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import com.alibaba.fastjson.JSONObject;

//@Component
//@Aspect
public class ResultAop {
	
	
	@Pointcut("execution(* com.canway.web.controller.*.*(..))")
	public void resultPointcut() {}
	
	
	
	@Around("resultPointcut()")
	public Object doAroud(ProceedingJoinPoint pjp ) {
		Object result  = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		ResultJson resultJson = new ResultJson(200, "", result);
		return JSONObject.toJSONString(resultJson);
		
		
		
		
	}

}
