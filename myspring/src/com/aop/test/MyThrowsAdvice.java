package com.aop.test;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method m,Object[] args,Object target,Exception e)
	{
		System.out.println("出大事了:" +e);
	}

}
