package com.james.dependency.inversion.template.pattern.processes;

/*
 * The Dependency Inversion Principle states:  

		High level modules should not depend upon low level modules. Both should depend upon abstractions.
		Abstractions should not depend upon details. Details should depend upon abstractions.
 */
public abstract class GeneralManufacturingProcess {

	private String processName;
	
	
	public GeneralManufacturingProcess(String processName) {
		super();
		this.processName = processName;
	}
	
	protected abstract void assemblingDevices();
	protected abstract void testingDevices();
	protected abstract void packagingingDevices();
	protected abstract void storingingDevices();
	
	//Template Method Design Pattern - abstracting workflows that are common across 
	//many types of objects. The abstract methods are implemented in the sub-classes 
	//but are called in the abstract class itself as part of the generally defined processor flow
	//This is commonly classified as a behavioural design pattern - defines the program skeleton in a method - called the Template method
	//There's a big difference when packaging a smartphone/ laptop - so when the method launchProcess() is invoked, the flow is the same across all
	//devices but the details are different depending on what device process it is.
	
	public void launchProcess(){
		if (processName !=null && !processName.isEmpty()) {
			System.out.println("Process Name: " + getProcessName());
			assemblingDevices();
			testingDevices();
			packagingingDevices();
			storingingDevices();
		}
		else{
			System.out.println("No process name was specified...");
		}
		
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	
}
