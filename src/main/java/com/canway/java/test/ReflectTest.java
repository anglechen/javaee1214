/**
 *
 */
package com.canway.java.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.canway.java.model.People;

/**
 * @author aubrey
 * @date  上午11:51:21
 * 
 */
public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		People p1 = new People();
		p1.setName("张三");
		p1.setAge(23);
		System.out.println(p1);
		
		
//		反射
		
		ClassLoader loader    = ReflectTest.class.getClassLoader();
		
		Class clazz = loader.loadClass("com.canway.java.test.People");
		
		System.out.println("反射");
//		Field[] fields = clazz.getFields();
//		for(Field f : fields) {
//			System.out.println(f.getName());
//		}
		
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getName());
		}
		
		
		System.out.println("方法");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
//			m.invoke(obj, args)
			System.out.println("方法名：" +m.getName());
		}
		
		
		System.out.println("==========");
		Constructor constructor = clazz.getConstructor(String.class);
		People obj = (People) constructor.newInstance("李四");
		
		System.out.println(obj);
		
	}
}







