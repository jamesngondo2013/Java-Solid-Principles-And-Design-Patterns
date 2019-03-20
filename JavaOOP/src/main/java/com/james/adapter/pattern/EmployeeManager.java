package com.james.adapter.pattern;

/*
 * This is an adaptee class
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

	public List<Employee> employees;

	public EmployeeManager() {
		employees = new ArrayList<Employee>();
		this.employees.add(new Employee(1, "James Ngondo"));
		this.employees.add(new Employee(2, "Gilby Gombe"));
		this.employees.add(new Employee(1, "Baxter Msati"));
	}
	
	public String getAllEmployeesInXML(){
		 
		return "employees in xml format";
		
	}
	
}
