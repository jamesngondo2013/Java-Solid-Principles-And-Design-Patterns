package com.james.design.principles.association;

/*
 * COMPSITION - Vehicle has Engine, Wheels
 */
public class Vehicle {
	
	Engine engine;
	Wheels wheels;

	public Vehicle(Engine engine, Wheels wheels) {
		super();
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}

	public void accelerate(){
		System.out.println("Accelerating now...");
	}
	
	public void startEngine(){
		System.out.println("Starting Engine now...");
	}
	
	public void stopEngine(){
		System.out.println("Stopping Engine now...");
	}
}
