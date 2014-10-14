package com.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.util.ApplicationContextUtil;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContextUtil.getApplicationContext()
		//ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/beanlife/beans.xml");
		//获取对象
		//Person person = (Person) acApplicationContext.getBean("person");
				
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/beanlife/beans.xml"));
		
		Person person = (Person) factory.getBean("person");
		person.sayHi();
		


	}

}
