package com.james.design.principles.association;

public class Engine {

	private String manufacturer;
	private String model;
	private int hp;
	private double engineSize;
	
	public Engine(String manufacturer, String model, int hp, double engineSize) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.hp = hp;
		this.engineSize = engineSize;
	}

	public String getManufacturer() {
		
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHp() {
		
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public double getEngineSize() {
		
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public void getEngineData(){
		String data = "Model: " + model+ "\n"+
	                  "Manufacturer: " + manufacturer+"\n"+
	                  "Engine Size: " + engineSize+"\n"+
	                  "HP : " + hp;
		System.out.println();
		System.out.println("Reading Engine Data...");
		System.out.println(data);
		System.out.println();
	}
	
	
}
