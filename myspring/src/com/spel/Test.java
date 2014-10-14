package com.spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spel/beans-spel.xml");
		
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(address);
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		

	}

}
