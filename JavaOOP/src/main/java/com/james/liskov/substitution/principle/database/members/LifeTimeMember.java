package com.james.liskov.substitution.principle.database.members;

public class LifeTimeMember extends Member{
	
	private String name;
	
	public LifeTimeMember(String name) {
		super(name);
		this.name = name;
	}

	public void addToDatabase() {
	System.out.println(name+ " LifeTime member add to DB...");
		
	}

	public void makeBooking() {
		System.out.println(name + " LifeTime member make booking...");
		
	}

}
