package com.spel;

public class Car {
	
	private String brand;
	private double price;
	
	private double tyreParameter;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyreParameter="
				+ tyreParameter + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTyreParameter() {
		return tyreParameter;
	}

	public void setTyreParameter(double tyreParameter) {
		this.tyreParameter = tyreParameter;
	}
	

}
