package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.repository.UserRepository;
import com.annotation.repository.controller.UserController;
import com.annotation.repository.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub·
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/annotation/beans.xml");
		
		//System.out.println("class file loaded");
//		TestObject testObject = (TestObject) acApplicationContext.getBean("testObject");
//		System.out.println(testObject);
		
		UserController uController = (UserController) acApplicationContext.getBean("userController");
		System.out.println(uController);
		uController.execute();
		
		//UserService userService = (UserService)acApplicationContext.getBean("userService");
//		System.out.println(userService);
//		
//		UserRepository userRepository = (UserRepository) acApplicationContext.getBean("userRepository");
//		System.out.println(userRepository);
		
		
		
		

	}

}
