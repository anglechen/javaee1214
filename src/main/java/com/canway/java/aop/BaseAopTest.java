/**
 *
 */
package com.canway.java.aop;

/**
 * @author aubrey
 * @date  下午4:09:04
 * 
 */
public class BaseAopTest {
	
	public static void main(String[] args) throws InterruptedException {
		BaseAop base2 = new BaseAop2(new BaseAop());
		BaseAop base1 = new BaseAop();
		base2.add();
		base1.add();
	}
}
