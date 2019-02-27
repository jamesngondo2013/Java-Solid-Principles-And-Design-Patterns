package com.training.open.closed.strategy.principle.hospitalemployee;

public abstract class Employee implements IEmployeeService{

	private int empid;
	private String name;
	private String department;
	
	public Employee(int empid, String name, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void getEmployeeDetails(){
		String data = "Employee ID: " + empid+ "\n"+
                "Employee name: " +name+"\n"+
                "Employee Dept: " + department;
	System.out.println(data);
	}
}
