/**
 *
 */
package com.canway.java.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author aubrey
 * @date  下午2:17:24
 * 
 */
@Component
public class Car {
	
	
//	构造注入  byName,byTyep
//	设值注入 byName,byTyep
//	@Resource  //默认：byName
	@Autowired  //默认：byType
//	@Qualifier("people")
	private People people;
	
	
	
	public People getPeople() {
		return people;
	}



	public void setPeople(People people) {
		this.people = people;
	}



	public void driver() {
		people.test();
		System.out.println("这是car里面的people调用");
	}
}
