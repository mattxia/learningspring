package com.constructor;

public class Employee {
	public Employee(String name, int age) {
		super();
		System.out.println("Employee(String name, int age) is called");
		this.name = name;
		this.age = age;
	}
	
	
	public Employee(String name) {
		super();
		System.out.println("Employee(String name) is called");
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Employee() is called");
	}


	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
