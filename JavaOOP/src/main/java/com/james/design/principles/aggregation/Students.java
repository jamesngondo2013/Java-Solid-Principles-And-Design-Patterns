package com.james.design.principles.aggregation;

import java.util.Date;

public class Students {

	private String name;
	private String DOB;
	private String gender;
	public Students(String name, String dOB, String gender) {
		super();
		this.name = name;
		DOB = dOB;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
