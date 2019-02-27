package com.james.observer.pattern.employee;

public class Employee {

	private String name;
	private String dpt;
	public int empid;
	
	private static int counter; 
	
	public Employee(String name, String dpt) {
		super();
		this.name = name;
		this.dpt = dpt;
		empid = ++counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public int getEmpid() {
		return empid;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dpt=" + dpt + ", empid=" + empid + "]";
	}
	
	
}
