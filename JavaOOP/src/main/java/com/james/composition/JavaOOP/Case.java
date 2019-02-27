package com.james.composition.JavaOOP;

public class Case {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;
	private Motherboard motherboard;
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions, Motherboard motherboard) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
		this.motherboard = motherboard;
	}
	
	public void pressThePowerButton(){
		System.out.println("Power button pressed...");
	}
	
	public void coolingFan(){
		System.out.println("Cooling fan started...");
	}

	public String getModel() {
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

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	
	 public void getCaseDetails(){
	    	String data = "Case Model : " + model+ "\n"+
	    			"Case Manufacturer: " + manufacturer+"\n"+
	    			"Case Power Supply: " + powerSupply+"\n"+
	    			"Case dimensions: " + dimensions.getDimensionsDetails();
		System.out.println();
		System.out.println("Reading Casing Spec Data...");
		System.out.println(data);
		System.out.println();
	    }
	
}
