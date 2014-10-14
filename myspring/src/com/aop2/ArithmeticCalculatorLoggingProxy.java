package com.aop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy  {
	
	private ArithmeticCalculator target;
	
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target)
	{
		this.target = target;
	}
	
	
	public ArithmeticCalculator getLoggingProxy()
	{
		ArithmeticCalculator proxy =null;
		
		//代理对象又哪一个类加载器加载
		ClassLoader loader = target.getClass().getClassLoader();
		
		//代理对象的类型，即其中有哪些方法
		Class[] interfaces = new Class[]{ArithmeticCalculator.class};
		
		//当调用代理对象其中的方法时，该执行的代码
		InvocationHandler h = new InvocationHandler() {
			
			/**
			 * proxy:正在返回的那个代理对象，一般情况下，在invoke方法中一般不使用该对象
			 * method:正在被调用的方法
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("invoke...");
				System.out.println("The method: " +method.getName()+" begin with "+Arrays.asList(args));
				//执行该方法
				//这里为什么用target??target是实际的类，proxy是代理类会无限循环调用proxy的invoke
				Object result = method.invoke(target, args);
				return result;
			}
		};
		
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		
		return proxy;
	}

}
