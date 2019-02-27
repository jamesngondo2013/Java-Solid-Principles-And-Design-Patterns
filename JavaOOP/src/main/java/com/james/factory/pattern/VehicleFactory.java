package com.james.factory.pattern;

public class VehicleFactory {

	public Vehicle getVehicle(VehicleType vehicleType){
		
		return vehicleType.getVehicle();
		
	}

}
