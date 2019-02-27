package com.james.factory.pattern;

public class VehicleRunner {

	public static void main(String[] args) {
		VehicleFactory fc = new VehicleFactory();
		
		VehicleType type[] = VehicleType.values();
		
		for (VehicleType vehicleType : type) {
			
			try {
				
				Thread.sleep((int) (Math.random() * 8000));
				
				Vehicle vehicle = fc.getVehicle(vehicleType);
				vehicle.startEngine();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
				
		
	}
	
}
