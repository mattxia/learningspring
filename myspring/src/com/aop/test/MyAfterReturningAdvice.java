package com.aop.test;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("afterruturning from "+target.getClass().getCanonicalName()+", method: "+method.getName()+", returning "+returnValue);
		//System.out.println("afterruturning from "+target.getClass().getCanonicalName());

	}

}
