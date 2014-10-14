package com.aop.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.ApplicationContextUtil;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContextUtil.getApplicationContext()
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/aop/test/beans.xml");
		//TestService1 testService1 = (TestService1) acApplicationContext.getBean("testService1");
		//testService1.sayHello();
		
		TestServiceIter testServiceIter = (TestServiceIter)acApplicationContext.getBean("proxyFactoryBean");
		System.out.println("TestServiceIter is "+testServiceIter.getClass().getCanonicalName());
		testServiceIter.sayHello();
		TestServiceIter2 iter2 = (TestServiceIter2)testServiceIter;
		iter2.sayBye();
	
		
	}

}
