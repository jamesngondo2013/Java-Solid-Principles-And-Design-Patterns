package com.james.facade.pattern;

public class FacadeClientRunner {

	public static void main(String[] args) {
		
		ITravelPackageFacade myTravelPackage = new TravelPackageFacade();
		myTravelPackage.booking();
	}

}
