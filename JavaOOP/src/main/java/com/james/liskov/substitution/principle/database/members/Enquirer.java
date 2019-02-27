package com.james.liskov.substitution.principle.database.members;

public class Enquirer implements IDatabase{

	private String name;
	
	public Enquirer(String name) {
		super();
		this.name = name;
	}

	public void addToDatabase() {
		System.out.println(name+" Enquirer add to DB...");
		
	}

	
}
