package com.james.adapter.pattern;

/*
 * This is the Adapter class
 */
public class EmployeeAdapter extends EmployeeManager implements IEmployee{

	public String getAllEmployees() {
		String xml = getAllEmployeesInXML();
		//convert xml data to JSON
		return "returning all employees in JSON";
	}

	
}
