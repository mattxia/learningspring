package com.aop2;

public class Main {
	
	public static void main(String[] args)
	{
//		ArithmeticCalculator arithmeticCalculator = null;
//		
//		arithmeticCalculator = new ArithmeticCalculatorImpl();
		
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		
		
		int result = proxy.add(1, 2);
		System.out.println("-->"+result);
		
		result = proxy.div(2, 1);
		System.out.println("-->"+result);
	}

}
