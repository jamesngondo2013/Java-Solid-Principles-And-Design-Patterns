package com.james.design.principles.association;

/*
 * DEPENDENCY ASSOCIATION - define a relationship between classes e.g Driver is dependent on the Vehicle to drive
 */
public class Driver {

	public void drive(Vehicle raceCar){
		raceCar.startEngine();
		raceCar.getEngine().getEngineData();
		raceCar.getWheels().getWheelSpec();
		raceCar.accelerate();
		
		
	}
}
