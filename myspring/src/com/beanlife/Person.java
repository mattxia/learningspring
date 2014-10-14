package com.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	private String name;
	
	public Person(String strname)
	{
		this.name = strname;
		System.out.println("person(strname) is called");
	}
	
	public Person()
	{
		System.out.println("Person constuctor is called");
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
		System.out.println("setName is called");
	}



	public void sayHi()
	{
		System.out.println("hi " + name);
	}

	//该方法可以给arg0表示正在被实例化的bean id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName is called ,value:"+arg0);
		
	}

	//该方法可以传递beanfactory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("setBeanfactory "+beanFactory.getBean("person"));
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("setApplicationContext"+applicationContext);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet is called");
		
	}
	//也可以通过注解方式来配置哪个方法是init-method
	@PostConstruct
	public void init()
	{
		System.out.println("my owns initialize method");
	}

	@Override
	@PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//可以关闭数据资源，释放资源
		System.out.println("destroy is called");
		
	}
}
