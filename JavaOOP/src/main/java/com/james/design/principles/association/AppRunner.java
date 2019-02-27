package com.james.design.principles.association;

public class AppRunner {

	public static void main(String[] args) {
		
		Wheels wheels = new Wheels("Lug Bolts", "M14 X 1.5", 51.7, 36);
		Vehicle raceCar = new Vehicle(new Engine("Volkswagen", "Golf GTI", 120, 2.5), wheels);
		
		Driver driver = new Driver();
		driver.drive(raceCar);

	}

}
