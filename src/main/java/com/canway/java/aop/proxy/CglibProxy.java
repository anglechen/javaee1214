package com.canway.java.aop.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy  implements MethodInterceptor{

	
	private Enhancer enhancer = new Enhancer();
	
	
	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("代理执行开始===========");
		long start = System.currentTimeMillis();
		
		Object restult = proxy.invokeSuper(obj, args);
		
		long end = System.currentTimeMillis();
		System.out.println("CGLIB动态代理，方法耗时：" + (end - start));
		System.out.println("代理执行结束===========");
		return restult;
	}

}
