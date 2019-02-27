package com.james.design.principles.aggregation;

import java.util.List;

public class EnglishCourse {

	private String courseId;
	private int numOfModules;
	private List<CourseModule> modules;
	private List<Students> students;
	
	public EnglishCourse(String courseId, int numOfModules, List<CourseModule> modules, List<Students> students) {
		super();
		this.courseId = courseId;
		this.numOfModules = numOfModules;
		this.modules = modules;
		this.students = students;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getNumOfModules() {
		return numOfModules;
	}

	public void setNumOfModules(int numOfModules) {
		this.numOfModules = numOfModules;
	}

	public List<CourseModule> getModules() {
		return modules;
	}

	public void setModules(List<CourseModule> modules) {
		this.modules = modules;
	}

	public List<Students> getStudents() {
	
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
}
