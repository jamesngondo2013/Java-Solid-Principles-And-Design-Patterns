package com.james.observer.pattern.employee;

/*
 * This is HR Observer
 */
public class HRDept implements IObserver{

	public void callMe(Employee emp, String msg) {
		System.out.println("HR notified...");
		System.out.println(msg+" "+ emp.getName());
		
	}

}
