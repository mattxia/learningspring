package com.constructor;

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
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/constructor/beans.xml");
		Employee employe = (Employee) acApplicationContext.getBean("employee");
		System.out.println(employe.toString());
		Employee employe2 = (Employee) acApplicationContext.getBean("employee2");
		System.out.println(employe2.toString());
		
	}

}
