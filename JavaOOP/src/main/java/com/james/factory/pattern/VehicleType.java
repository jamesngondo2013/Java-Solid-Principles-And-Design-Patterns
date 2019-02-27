package com.james.factory.pattern;

public enum VehicleType {
	
	ELECTRIC_CAR{
		public Vehicle getVehicle() {
			return new ElectricCar();	
		}
	},
	CAR{
		public Vehicle getVehicle() {
			return new Car();	
		}
	},
	BUS{
		public Vehicle getVehicle() {
			return new Bus();	
		}
	},
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();	
		}
	};
	
	
	abstract Vehicle getVehicle();
	/*
	public Vehicle getVehicle() {
		
		switch(this){
		
		case TRUCK:
			return new Truck();
			
		case CAR:
			return new Car();
			
		case BUS:
			return new Bus();
			
		case ELECTRIC_CAR:
			return new ElectricCar();
			
		default:
            throw new Error("No VEHICLE TYPE IDENTIFIED...");
		}	
	}
	*/
}
