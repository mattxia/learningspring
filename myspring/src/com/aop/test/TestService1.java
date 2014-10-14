package com.aop.test;

public class TestService1 implements TestServiceIter,TestServiceIter2 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hello "+name);
		//int i=9/0;

	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye "+name);
		
	}

}
