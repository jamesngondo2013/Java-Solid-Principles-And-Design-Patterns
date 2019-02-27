package com.james.composition.JavaOOP;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard (String model, String manufacturer, int ramSlots, int cardSlots, String bios)
    {
        super();
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram (String programName)
    {
        System.out.println(programName + "loading...");
    }

    public String getModel ()
    {
    	
        return model;
    }

    public void setModel (String model)
    {
        this.model = model;
    }

    public String getManufacturer ()
    {
        return manufacturer;
    }

    public void setManufacturer (String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots ()
    {
    	
        return ramSlots;
    }

    public void setRamSlots (int ramSlots)
    {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots ()
    {
    	
        return cardSlots;
    }

    public void setCardSlots (int cardSlots)
    {
        this.cardSlots = cardSlots;
    }

    public String getBios ()
    { 	
        return bios;
    }

    public void setBios (String bios)
    {
        this.bios = bios;
    }
    
    public void getMotherboardDetails(){
    	String data = "Motherboard Model : " + model+ "\n"+
    			"Motherboard Manufacturer: " + manufacturer+"\n"+
    			"Num of Ram Slots on Motherboard: " + ramSlots+"\n"+
    			"Num of Card Slots on Motherboard: " + cardSlots+"\n"+
    			"Bios Version on " + getModel() + ":" + bios;
	System.out.println();
	System.out.println("Reading Motherboard Spec Data...");
	System.out.println(data);
	System.out.println();
    }

}
