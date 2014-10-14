package com.service;

public class UserService {
	
	private String name;
	
	private BybService bybService;
	
	public BybService getBybService() {
		return bybService;
	}

	public void setBybService(BybService bybService) {
		this.bybService = bybService;
	}

	public void sayHello()
	{
		System.out.println("hello " +this.getName());
		bybService.sayBye();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
