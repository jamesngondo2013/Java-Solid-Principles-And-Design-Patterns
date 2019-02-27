package com.james.liskov.substitution.principle;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor{

	public void teach() {
		System.out.println("Teach Science...");
		
	}

}
