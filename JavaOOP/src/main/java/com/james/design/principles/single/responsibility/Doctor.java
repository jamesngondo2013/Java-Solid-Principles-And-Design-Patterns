package com.james.design.principles.single.responsibility;

public class Doctor extends Employee{

	public Doctor(int empid, String name, String department) {
		super(empid, name, department);
		
		
	}

	public void taskforToday() {
		
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
