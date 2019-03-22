package com.james.runtime.polymorphism;

public class MobileNetworkRunner {

	public static void main(String[] args) {
		
		Sim lyca = new LycaMobile();
		Sim tesco = new TescoMobile();
		
		SimManufacture sim = new SimManufacture();
		sim.useSimCard(lyca);
		sim.useSimCard(tesco);
		

	}

}
