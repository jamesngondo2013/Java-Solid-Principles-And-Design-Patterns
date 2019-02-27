package com.james.composition.JavaOOP;

public class Keyboard {

	private String model;
	private String manufacturer;
	private String color;
	
	public Keyboard(String model, String manufacturer, String color) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
	}
	
	public void checkKeyboard() {
		System.out.println("keyboard enabled...");
	}


	public String getModel() {
		
		System.out.println("Keyboard Model: " +model);
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
