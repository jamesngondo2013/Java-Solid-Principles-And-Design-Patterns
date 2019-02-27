package com.james.observer.pattern.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMgtSystem implements ISubject{

	private List<Employee> listEmployees;
	private List<IObserver> observer;
	private EmployeeDAO dao; 
	private Employee employee;
	private String msg;

	public EmployeeMgtSystem() {
		observer = new ArrayList<IObserver>();
		dao = new EmployeeDAO();
		listEmployees = dao.generateEmployee();	
	}
	
	
	public void modifyEmployee(int id, String name){
		boolean notify = false;
		String oldName;
		for (Employee emp : listEmployees) {
			if (id == emp.empid) {
				oldName = listEmployees.get(id).getName();
				emp.setName(name);
				this.employee = emp;
				this.msg ="Employee Name :"+oldName+" "+ "Changed to: ";
				notify=true;
			}
			
		}
		if (notify) {
			notifyObservers();
		}
		else{
			System.out.println("Cannot modify employee, Invalid Employee details entered...");
		}
	}
	
	public void registerObservers(IObserver ob){
		observer.add(ob);
		
	}

	public void removeObservers(IObserver obs) {
		observer.remove(obs);
		
		
	}

	public void notifyObservers() {
		for (IObserver depts : observer) {
			
			depts.callMe(employee, msg);
			
		}
		
	}
	
	public void hireNewEmployee(Employee emp) {
		employee = emp;
		dao.addEmployee(emp);
		msg ="New Hire: ";
		notifyObservers();
		
	}
	
}
