package com.james.liskov.substitution.principle.database.members;

public abstract class Member implements IDatabase, IBooking{

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Member(String name) {
		super();
		this.name = name;
	}


}
