/**
 *
 */
package com.canway.java.aop;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.canway.java.aop.annotation.LogAnnotation;

/**
 * @author aubrey
 * @date  下午3:44:43
 * 
 */
@Component
public class BaseAop implements BaseAopInterface{
	
	
	@LogAnnotation(name = "add",className = "baseAop")
	public void add() throws InterruptedException {
//		long start = System.currentTimeMillis();
		
		
		Thread.sleep(1000);
		System.out.println("这是新增方法");
		
//		long end = System.currentTimeMillis();
//		System.out.println("add方法执行时间：" + (end - start));
		
	}
	
	@LogAnnotation
	public void mod() throws InterruptedException {
//		long start = System.currentTimeMillis();
		
		Thread.sleep(1000);
		System.out.println("这是mod方法");
		
//		long end = System.currentTimeMillis();
//		System.out.println("mod方法执行时间：" + (end - start));
		
	}
	
	public void del() throws InterruptedException {
//		long start = System.currentTimeMillis();
		
		Thread.sleep(1000);
		System.out.println("这是删除方法");
		
//		long end = System.currentTimeMillis();
//		System.out.println("del方法执行时间：" + (end - start));
	}
	
	public void query() throws InterruptedException {
//		long start = System.currentTimeMillis();
		
		Thread.sleep(1000);
		System.out.println("这是查询方法");
		
//		long end = System.currentTimeMillis();
//		System.out.println("query方法执行时间：" + (end - start));
		
	}

}
