package com.james.liskov.substitution.principle.database.members;

import java.util.ArrayList;
import java.util.List;

public class BookingRunner {

	public static void main(String[] args) {
		
		List<IDatabase> list = new ArrayList<IDatabase>();
		list.add(new AnnualMember("James"));
		list.add(new LifeTimeMember("Gilby"));
		list.add(new Enquirer("Keith"));
		
		for (IDatabase iDatabase : list) {
			iDatabase.addToDatabase();
			
		}

	}

}
