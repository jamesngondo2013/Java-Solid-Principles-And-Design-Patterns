package com.james.liskov.substitution.principle;

public class MathsTeacher extends SchoolStaff implements CourseInstructor{

	public void teach() {
		System.out.println("Teach Maths...");
		
	}

}
