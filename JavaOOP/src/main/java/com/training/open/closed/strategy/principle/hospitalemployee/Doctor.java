package com.training.open.closed.strategy.principle.hospitalemployee;

public class Doctor extends Employee{

	public Doctor(int empid, String name, String department) {
		super(empid, name, department);	
	}

	public void taskforToday() {
		System.out.println("Doctor in action...");
		prescribeMedicine();
		diagnosePatients();
	}
	
	//Doctors
	private void prescribeMedicine(){
			System.out.println("Precsribe Maedicine...");
	}
		
	private void diagnosePatients(){
			System.out.println("Diagnosing Patient...");
	}
		

}
