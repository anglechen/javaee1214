/**
 *
 */
package com.canway.java.test;

/**
 * @author aubrey
 * @date  上午10:50:23
 * 
 */
public class TestInterface {
	public static void main(String[] args) {
//		 TestA test = new TestAImpl();
		TestA test2 = new TestAImpl2();
//		 test.test();
		test2.test();
		
		TestAImpl test = TestUtil.test1();
	}
}
