package com.training.open.closed.strategy.principle.hospitalemployee;

public class HospitalManagement {
/*
 * HospitalManagement class encapsulates a strategy implementation and executes it.
 * If other workers are added, they will just do work based on what's been defined in their classes (behaviour.
 * And the specifics of their behaviour is no-else's business. 
 * This system is now open for extension and closed for modifications. There's no need to modify the framework to support 
 * new employee responsibilities. 
 * Open/ Closed Principle & Strategy Design Pattern - makes the system more ABSTRACT to support extensibility, and this pattern enables
 * an algorithm's behaviour to be selected at runtime - algorithm is very independent of the clients that use it.
 */
	private IEmployeeService service;
	
	public HospitalManagement(IEmployeeService service) {
		
		this.service = service;
	}
	
	public void callUpon(Employee emp){
		
		emp.taskforToday(); //encapsulation and execution
	}
	
	
	
}
