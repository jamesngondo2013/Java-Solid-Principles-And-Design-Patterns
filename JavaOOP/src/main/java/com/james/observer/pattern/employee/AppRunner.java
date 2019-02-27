package com.james.observer.pattern.employee;

public class AppRunner {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDept();
		IObserver hr = new HRDept();
		
		EmployeeMgtSystem ems = new EmployeeMgtSystem();
		ems.registerObservers(payroll);
		ems.registerObservers(hr);
		
		Employee bob = new Employee("Bob", "Tools");
		ems.hireNewEmployee(bob);
		System.out.println();
		
		ems.modifyEmployee(4, "Prosper");
		System.out.println();
		
	}
}
