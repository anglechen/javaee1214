/**
 *
 */
package com.canway.java.aop;

/**
 * @author aubrey
 * @date  下午4:06:29
 * 
 */
public class BaseAop2 {
	
	private BaseAop baseAop;
	
	public BaseAop2(BaseAop baseAop) {
		this.baseAop = baseAop;
	}
	
	
	
	public void add() throws InterruptedException {
		long start = System.currentTimeMillis();
		baseAop.add();
		long end = System.currentTimeMillis();
		System.out.println("耗时："+ (end -start));
	}



	public void add2() throws InterruptedException {
		long start = System.currentTimeMillis();
		baseAop.add();
		long end = System.currentTimeMillis();
		System.out.println("耗时："+ (end -start));
	}
	
	

}
