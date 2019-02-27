package com.james.dependency.inversion.template.pattern.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess{

	public LaptopManufacturingProcess(String processName) {
		super(processName);
		
	}

	@Override
	protected void assemblingDevices() {
		
		System.out.println("Laptop assembled...");
	}

	@Override
	protected void testingDevices() {
		
		System.out.println("Laptop tested...");
	}

	@Override
	protected void packagingingDevices() {
		
		System.out.println("Laptop packaged...");
	}

	@Override
	protected void storingingDevices() {
	
		System.out.println("Laptop stored...");
	}

}
