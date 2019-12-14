/**
 *
 */
package com.canway.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.canway.java.model.Car;
import com.canway.java.model.People;
import com.canway.java.test.TestA;
import com.canway.java.test.TestAImpl;

/**
 * @author aubrey
 * @date  下午12:24:40
 * 
 */
public class BeanFactoryTest {
	
	@Test
	public void testBean() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
//		People p1 = (People) applicationContext.getBean("people");
//		People p2 = (People) applicationContext.getBean("people");
		
		People p3 = applicationContext.getBean(People.class);
		
//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(p3);
		
//		TestA ta = applicationContext.getBean(TestA.class);
		assertNotNull(p3);
		
	}
	
	@Test
	public void testATest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
		TestA t1 = (TestA) applicationContext.getBean("t1");
		System.out.println(t1);
		assertNotNull(t1);
	
	}
	
	
	@Test
	public void testCar() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
		Car car = (Car) applicationContext.getBean("car");
		car.driver();
		System.out.println(car);
		
		System.out.println("直接从spring容器里面获取的people对象" + applicationContext.getBean("p1"));
		System.out.println("Car对象里面的people对象：" + car.getPeople());
		assertNotNull(car);
	
	}
	
	@Test
	public void testAnnotation() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-simple.xml");
//		People p1 = (People) applicationContext.getBean("people");
		Car car = (Car) applicationContext.getBean("car");
//		TestA t1 = (TestA) applicationContext.getBean("testAImpl");
//		System.out.println(p1);
		System.out.println(car);
//		System.out.println(t1);
		System.out.println(car.getPeople());
		
	}
	
	
	
}
