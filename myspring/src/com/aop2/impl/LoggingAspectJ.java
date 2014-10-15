package com.aop2.impl;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect	//声明成一个切面
@Component	//成为IOC容器的bean
public class LoggingAspectJ {
	
	@Before("execution(int com.aop2.impl.ArithmeticCalculatorImpl.*(int, int))")
	public void before(JoinPoint joinPoint)
	{
		String method = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		
		System.out.println("before "+method +" is called, with Args " + args);
		
	}
}
