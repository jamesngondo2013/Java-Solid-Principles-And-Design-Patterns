package com.james.dependency.inversion.template.pattern.processes;

public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess{

	public SmartPhoneManufacturingProcess(String processName) {
		super(processName);
		
	}

	@Override
	protected void assemblingDevices() {
		
		System.out.println("Smartphone assembled...");
	}

	@Override
	protected void testingDevices() {
		
		System.out.println("Smartphone tested...");
	}

	@Override
	protected void packagingingDevices() {
		
		System.out.println("Smartphone packaged...");
	}

	@Override
	protected void storingingDevices() {
		
		System.out.println("Smartphone stored...");
	}

}
