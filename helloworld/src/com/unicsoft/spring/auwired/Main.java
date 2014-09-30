package com.unicsoft.spring.auwired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person = (Person) ctx.getBean("person");
		
		System.out.println(person);
		
		Person person2 = (Person) ctx.getBean("person2");
		
		System.out.println(person2);

	}

}
