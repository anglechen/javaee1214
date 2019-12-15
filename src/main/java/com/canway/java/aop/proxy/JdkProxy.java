package com.canway.java.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler{

	private Object target;
	
	
	public JdkProxy(Object obj) {
		this.target = obj;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("代理执行开始===========");
		long start = System.currentTimeMillis();
		
		Object restult = method.invoke(target, args);
		
		long end = System.currentTimeMillis();
		System.out.println("jdk动态代理，方法耗时：" + (end - start));
		System.out.println("代理执行结束===");
		return restult;
	}

}
