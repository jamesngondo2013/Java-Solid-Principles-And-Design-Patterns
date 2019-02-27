package com.james.observer.pattern.employee;

/*
 * THIS IS PAYROLL DPT OBSERVER
 */
public class PayrollDept implements IObserver{

	public void callMe(Employee emp, String msg) {
	
		System.out.println("Payroll notified...");
		System.out.println(msg+" "+ emp.getName());
		System.out.println();
	}

}
