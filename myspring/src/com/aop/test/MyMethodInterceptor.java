package com.aop.test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(arg0.getMethod().getName()+" is called before");
		Object object = arg0.proceed();
		System.out.println(arg0.getMethod().getName()+" is called after");
		return object;
	}

}
