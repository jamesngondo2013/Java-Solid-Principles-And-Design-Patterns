package com.james.observer.pattern.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	Employee emp1 = new Employee("James", "GPD");
	Employee emp2 = new Employee("Cool", "Spot Buy");
	Employee emp3 = new Employee("Jerry", "Guided Buying");
	Employee emp4 = new Employee("Noel", "Sourcing");
	Employee emp5 = new Employee("Keith", "Network");
	
	private List<Employee> employees;
	
	public EmployeeDAO() {
		
	}

	public List<Employee> generateEmployee(){
		employees = new ArrayList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		return employees;
		
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
	public void removeEmployee(int id){
		employees.remove(id);
	}
	
}
