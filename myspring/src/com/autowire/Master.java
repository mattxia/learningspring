package com.autowire;

public class Master {
	public Master(Dog dog) {
		super();
		this.dog = dog;
		System.out.println(" Master(Dog dog) is called");
	}
	
	

	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}



	private String name;
	
	private Dog dog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	

}
