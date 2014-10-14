package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.util.ApplicationContextUtil;

public class Test {
	
	public static void main(String[] args)
	{
		//call sayHello by legacy way
		/*UserService userService= new UserService();
		userService.setName("Tom");
		userService.sayHello();
		*/
		//implement this with Spring
		//1.得到spring容器的ApplicationContext对象(容器对象）
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userService");
		userService.sayHello();
		((UserService)ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
		
		
		
	}

}
