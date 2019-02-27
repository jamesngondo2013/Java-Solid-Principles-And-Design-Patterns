package com.james.builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class BuilderRunner {

	public static void main(String[] args) {
		
		List<User> user = new ArrayList<User>();
		user.add(new User.Builder("cooljay", "bbb").build());
		user.add(new User.Builder("bob", "bbb").build());
		user.add(new User.Builder("gilby", "bbb").build());
		
		User reg = new User.Builder("James","jay@yahoo.ie")
				.phone("000000")
				.address("INCHICORE")
				.lastName("Ngondo")
				.firstName("James")
				.build();
		
		System.out.println("Email: "+ reg.toString());
		
	}

}
