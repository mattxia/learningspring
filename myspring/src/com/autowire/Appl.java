package com.autowire;

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
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/autowire/beans.xml");
		Master master = (Master) acApplicationContext.getBean("master");
		System.out.println(master.getName()+" has a dog: " +master.getDog().getName());
		
		Master master2 = (Master) acApplicationContext.getBean("master2");
		System.out.println(master2.getName()+" has a dog: " +master2.getDog().getName());
		
		Master master3 = (Master) acApplicationContext.getBean("master3");
		System.out.println(master3.getName()+" has a dog: " +master3.getDog().getName());
		
	}

}
