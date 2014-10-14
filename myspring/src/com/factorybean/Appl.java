package com.factorybean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContextUtil.getApplicationContext()
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/factorybean/beans.xml");
		Person  person =   (Person)ac.getBean("person");  
		System.out.println(person);
		
	}

}
