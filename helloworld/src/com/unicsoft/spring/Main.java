package com.unicsoft.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	
	public static void main(String[] args)
	{
		/*
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("unicsoft");
		
		*/
		
		//1.create Spring IOC container
		//这就是IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.create bean instance
		//利用id获取
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld2");
		
		System.out.println(helloWorld);
		
		//通过类型获取,但是要求IOC容器中只能有一个该类型的Bean
		HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld2);
		
		System.out.println(helloWorld2.equals(helloWorld));
		
		Car car = (Car)ctx.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car)ctx.getBean("car2");
		System.out.println(car2);
		
		System.out.println(car.equals(car2));
		
		Person person = (Person)ctx.getBean("person");
		System.out.println(person);
		
		Person person2 = (Person)ctx.getBean("person2");
		System.out.println(person2);
		
		Person person3 = (Person)ctx.getBean("person3");
		System.out.println(person3);
		
		Person person4 = (Person)ctx.getBean("person4");
		System.out.println(person4);
		
		
	
		
		//sayhello
		//helloWorld.hello();
	}
	

}
