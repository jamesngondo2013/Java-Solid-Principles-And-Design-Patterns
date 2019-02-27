package com.james.liskov.substitution.principle;

public class SchoolStaff {

	private void makeAnnouncements(){
		System.out.println("make Announcements...");
	}
	
	private void takeAttendance(){
		System.out.println("take Attendance...");
	}
	
	private void clollectPaperWork(){
		System.out.println("clollect PaperWork...");
	}
	
	public void performOtherDuties(){
		makeAnnouncements();
		takeAttendance();
		clollectPaperWork();
		
	}
	
	
}
