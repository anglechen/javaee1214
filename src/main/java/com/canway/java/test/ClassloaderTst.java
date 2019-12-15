/**
 *
 */
package com.canway.java.test;

/**
 * @author aubrey
 * @date  上午11:21:24
 * 
 */
public class ClassloaderTst {
	public static void main(String[] args) {
		System.out.println(ClassloaderTst.class.getClassLoader());
		System.out.println(ClassloaderTst.class.getClassLoader().getParent());
		System.out.println(ClassloaderTst.class.getClassLoader().getParent().getParent());
		
	}
}
