package com.james.composition.JavaOOP;

public class Monitor {

	private String name;
	private String manufacturer;
	private int size;
	private Resolution nativeResoultion;
	
	public Monitor(String name, String manufacturer, int size, Resolution nativeResoultion) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResoultion = nativeResoultion;
	}
	
	public void drawPixelAt(int x, int y, String  color){
		System.out.println("Drawing pixel at " + x + " " + y + " in color " + color );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeResoultion() {
		return nativeResoultion;
	}

	public void setNativeResoultion(Resolution nativeResoultion) {
		this.nativeResoultion = nativeResoultion;
	}
	
	
}
