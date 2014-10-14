package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ioc/beans.xml");
		//Student s1 = (Student)applicationContext.getBean("student");
		//Student s2 = (Student)applicationContext.getBean("student");
		//System.out.println(s1==s2);
		
		
		//从bean工厂中取出student
		//如果使用beanfactory去获取bean,当仅仅去实例化了factory，则不会去创建bean
		//只有当去使用bean的时候，才会被实例化(实时创建)
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ioc/beans.xml"));
		
		//大部分都是用applicationcontext加载(缓存在内存当中，提高加载速度)
		//当需要节约的时候，可以使用beanfactory,按需要加载
		//factory.getBean("student");
		

	}

}
