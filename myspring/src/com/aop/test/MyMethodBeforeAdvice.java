package com.aop.test;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
/**
 * 代理对象只需要配置不需要写，使用到了动态代理技术，由Spring支持
 * @author baobinxia
 *
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	/**
	 * method:which method is called
	 * args:args to call the method
	 * target:目标对象
	 */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging is called by "+target.getClass().getCanonicalName()+", in "+method.getName());

	}

}
