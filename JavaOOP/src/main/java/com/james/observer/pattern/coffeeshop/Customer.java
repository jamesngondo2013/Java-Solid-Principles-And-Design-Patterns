package com.james.observer.pattern.coffeeshop;

public class Customer implements WaitingCustomer{

	private String name;
	private String drinkOrdered;
	
	public Customer() {
		
	}
	
	public Customer(String name, String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setDrinkOrdered(String drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}

	   public void orderReady(String completedDrink) {
	        if (drinkOrdered.equals(completedDrink))
	            exitStore();
	    }
	 
	    private void exitStore() {
	        System.out.println(name + ": Thank you, I've recieved my "
	                + drinkOrdered + " and leaving the store now...");
	    }
	
	
	

}
