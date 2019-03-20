package com.james.adapter.pattern;

public class ClientRunner {

	/*
	 * Adapter Design Pattern :
	 * As per the GOF definition Adapter "Match interfaces of different classes", this Means, an adapter allows two incompatible interfaces to work together
		1. In software engineering, the adapter pattern is a software design pattern that allows the interface of an existing class to be used from another interface. It is often used to make existing classes work with others without modifying their source code.
		2. Leveraging on Adapter pattern Improves reusability of older functionality
		We need this design pattern when a class needs to be reused that doesn't have interface that a client expects
		We need to work through a separate Adapater that adapts the interface of an existing class without changing it
	 */
	public static void main(String[] args) {
		IEmployee empl = new EmployeeAdapter();
		String val = empl.getAllEmployees();
		System.out.println(val);
	}

}
