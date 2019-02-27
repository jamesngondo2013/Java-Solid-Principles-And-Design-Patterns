package com.james.design.principles.single.responsibility;

public class Nurse  extends Employee{

	public Nurse(int empid, String name, String department) {
		super(empid, name, department);
		
		
	}

	public void taskforToday() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();	
	}
	
	//Nurses
	private void checkVitalSigns(){
			System.out.println("Checking vitals...");
	}
		
	private void drawBlood(){
			System.out.println("Checking blood...");
	}
		
	private void cleanPatientArea(){
			System.out.println("Cleaning patient area...");
	}

}
