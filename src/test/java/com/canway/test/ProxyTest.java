package com.canway.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.canway.java.aop.BaseAop;
import com.canway.java.aop.BaseAopInterface;
import com.canway.java.aop.proxy.CglibProxy;
import com.canway.java.aop.proxy.JdkProxy;

public class ProxyTest {
	
	@Test
	public void jdkProxyTest() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
			
		Class clazz = Proxy.getProxyClass(BaseAop.class.getClassLoader(), BaseAopInterface.class);
		Constructor constructor = clazz.getConstructor(InvocationHandler.class);
		BaseAopInterface baseAop = (BaseAopInterface) constructor.newInstance(new JdkProxy(new BaseAop()));
		System.out.println(baseAop);
		baseAop.add();
		baseAop.mod();
		baseAop.del();
	
	
	}
	
	
	
	@Test
	public void jdkProxyTest2() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InterruptedException {
			
		BaseAopInterface baseAop = (BaseAopInterface) Proxy.newProxyInstance(BaseAop.class.getClassLoader(), new Class[] {BaseAopInterface.class}, new JdkProxy(new BaseAop()));
		baseAop.add();
		baseAop.mod();
		baseAop.del();	
		
	}


	@Test
	public void cglibProxyTest() throws InterruptedException {
		CglibProxy cglibProxy = new CglibProxy();
		
		BaseAop baseAop = (BaseAop) cglibProxy.getProxy(BaseAop.class);
		System.out.println(baseAop);
		baseAop.add();
		baseAop.mod();
		baseAop.del();	
	}
	
	
	

}
