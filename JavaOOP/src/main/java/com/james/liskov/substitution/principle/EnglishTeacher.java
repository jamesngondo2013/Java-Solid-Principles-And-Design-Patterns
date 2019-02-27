package com.james.liskov.substitution.principle;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor{

	public void teach() {
		System.out.println("Teach English...");
		
	}

}
