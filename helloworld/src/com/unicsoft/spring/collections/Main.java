package com.unicsoft.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.create Spring IOC container
				//Õâ¾ÍÊÇIOCÈÝÆ÷
				ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person5 = (Person)ctx.getBean("person5");
		System.out.println(person5);

	}

}
