package com.training.open.closed.strategy.principle.hospitalemployee;

public class EmergencyRoomProcessRunner {

	public static void main(String[] args) {
		
		Employee cathy = new Nurse(1, "Cathy Samalani", "Emergency Dept");
		Employee davie = new Doctor(2, "John Mponda", "Daediatric Dept");
		
		HospitalManagement mgt = new HospitalManagement(davie);
		mgt.callUpon(davie);
		

	}

}
