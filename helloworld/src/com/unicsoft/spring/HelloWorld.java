package com.unicsoft.spring;

public class HelloWorld {
	private String name;
	
	public void setName2(String name)
	{
		System.out.println("setName is invoked");
		this.name = name;
	}
	
	public void hello()
	{
		System.out.println("Hello, "+name);
	}
	
	public HelloWorld()
	{
		System.out.println("This is HelloWorld Constructor");
	}

}
