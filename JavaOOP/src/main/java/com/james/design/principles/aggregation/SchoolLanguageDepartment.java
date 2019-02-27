package com.james.design.principles.aggregation;

public class SchoolLanguageDepartment {

	private String DeptId;
	private SpanishCourse spanish;
	private FrenchCourse french;
	private EnglishCourse english;
	
	public SchoolLanguageDepartment(String deptId, SpanishCourse spanish, FrenchCourse french, EnglishCourse english) {
		super();
		DeptId = deptId;
		this.spanish = spanish;
		this.french = french;
		this.english = english;
	}

	public String getDeptId() {
		return DeptId;
	}

	public void setDeptId(String deptId) {
		DeptId = deptId;
	}

	public SpanishCourse getSpanish() {
		return spanish;
	}

	public void setSpanish(SpanishCourse spanish) {
		this.spanish = spanish;
	}

	public FrenchCourse getFrench() {
		return french;
	}

	public void setFrench(FrenchCourse french) {
		this.french = french;
	}

	public EnglishCourse getEnglish() {
		return english;
	}

	public void setEnglish(EnglishCourse english) {
		this.english = english;
	}
	
	
	
}
