package com.james.design.principles.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {

	public static void main(String[] args) {
		
		
		
		Students student1 = new Students("Jay", "12/12/1980", "M");
		Students student2 = new Students("Keith", "12/12/1980", "M");
		
		List<Students> stdFr = new ArrayList<Students>();
		stdFr.add(student1);
		stdFr.add(student2);
		
		CourseModule moduleFr = new CourseModule("1A", "French Grammar");
		CourseModule moduleFr2 = new CourseModule("1B", "French Literature");
		
		List<CourseModule> modulesFrench = new ArrayList<CourseModule>();
		modulesFrench.add(moduleFr);
		modulesFrench.add(moduleFr2);
		
		FrenchCourse fr = new FrenchCourse("FR1", 2, modulesFrench, stdFr);
		fr.getCourseId();
		fr.getNumOfModules();
		fr.getModules();
		fr.getStudents();
		
		//============
		Students student3 = new Students("John", "12/12/1980", "M");
		Students student4 = new Students("COOL", "12/12/1980", "M");
		
		List<Students> stdSP = new ArrayList<Students>();
		stdSP.add(student3);
		stdSP.add(student4);
		
		CourseModule modulesp = new CourseModule("1A", "Spanish Grammar");
		CourseModule modulesp2 = new CourseModule("1B", "Spanish Literature");
		
		List<CourseModule> modulesSP = new ArrayList<CourseModule>();
		modulesSP.add(modulesp);
		modulesSP.add(modulesp2);
		
		SpanishCourse sp = new SpanishCourse("SP1", 2, modulesSP, stdSP);
		
		// ============
		Students student5 = new Students("James", "12/12/1980", "M");
		Students student6 = new Students("Gilby", "12/12/1980", "M");

		List<Students> stdEn = new ArrayList<Students>();
		stdEn.add(student5);
		stdEn.add(student6);

		CourseModule moduleEN1 = new CourseModule("1A", "English Grammar");
		CourseModule modulesEN2 = new CourseModule("1B", "English Literature");

		List<CourseModule> modulesen = new ArrayList<CourseModule>();
		modulesen.add(moduleEN1);
		modulesen.add(modulesEN2);
		
		EnglishCourse en = new EnglishCourse("EN1", 2, modulesen, stdEn);
		
		SchoolLanguageDepartment lang = new SchoolLanguageDepartment("1", sp, fr, en);
		College college = new College();
		college.startAcademicYear(lang);
	}
}
