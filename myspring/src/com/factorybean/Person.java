package com.factorybean;

public class Person {
	
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [car=" + car + "]";
	}
	
	

}
