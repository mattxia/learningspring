package com.aop2.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/aop2/beans.xml");

		//这个怎么区分是接口还是类?
		ArithmeticCalculator ari = ac.getBean(ArithmeticCalculator.class);
		
		//不声明成@Component，获取出错
		TestWithoutComponent testWithoutComponent = ac.getBean(TestWithoutComponent.class);
		
		int result = ari.add(3, 6);
		
		
		
		System.out.println(result);
		
		result = ari.div(6, 3);
		
		System.out.println(result);
	}

}
