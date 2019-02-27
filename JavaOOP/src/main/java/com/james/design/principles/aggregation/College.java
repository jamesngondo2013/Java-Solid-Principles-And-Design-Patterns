package com.james.design.principles.aggregation;

public class College {

	public void startAcademicYear(SchoolLanguageDepartment schoolLangDept){
		schoolLangDept.getFrench().getStudents();
		schoolLangDept.getFrench().getModules();
		schoolLangDept.getFrench().getNumOfModules();
		schoolLangDept.getFrench().getCourseId();
		
	}
}
