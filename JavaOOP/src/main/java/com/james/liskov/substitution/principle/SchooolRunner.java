package com.james.liskov.substitution.principle;

import java.util.ArrayList;
import java.util.List;

public class SchooolRunner {

	/*
	 * Liskov Substittution Principle - also follows IS-A relationship
	 * Subclasses should be substitutable for their base class. You voilet this principle when a method is 
	 * not suppossed to be called on a method e.g a SubstituteTeacher should not cal the method teach()
	 * even though he follows a IS-A relationship because he / she can not teach a new subject - she/ he is a
	 * substitute teacher
	 */
	public static void main(String[] args) {
		SchoolStaff maths = new MathsTeacher();
		((MathsTeacher) maths).teach();
		maths.performOtherDuties();
		
		SchoolStaff science = new ScienceTeacher();
		SchoolStaff english = new EnglishTeacher();
		SchoolStaff sub = new SubstituteTeacher();
		
	}
}
