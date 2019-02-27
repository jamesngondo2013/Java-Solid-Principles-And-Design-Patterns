package com.james.liskov.substitution.principle.database.members;

public class AnnualMember extends Member{

	private String name;
	
	public AnnualMember(String name) {
		super(name);
		this.name=name;
	}

	public void addToDatabase() {
		System.out.println(name + " Annaul member add to DB...");
		
	}

	public void makeBooking() {
		System.out.println(name + " Annual member make booking...");
		
	}

}
