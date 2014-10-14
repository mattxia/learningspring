package com.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub·
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/generic/beans.xml");
		

		
		UserService userService = (UserService)acApplicationContext.getBean("userService");
		System.out.println(userService);
		userService.add();
//		
//		UserRepository userRepository = (UserRepository) acApplicationContext.getBean("userRepository");
//		System.out.println(userRepository);
		
		
		
		

	}

}
