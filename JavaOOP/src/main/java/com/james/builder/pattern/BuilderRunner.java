package com.james.builder.pattern;

public class BuilderRunner {

	public static void main(String[] args) {
		
		User reg = new User.Builder("James","jay@yahoo.ie")
				.phone("000000")
				.address("INCHICORE")
				.lastName("Ngondo")
				.firstName("James")
				.build();
		
		System.out.println("Email: "+ reg.toString());
		
	}

}
