package com.james.observer.pattern.coffeeshop;

public class CoffeShopRunner {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("James", "Latte");
		Customer cust2 = new Customer("John", "Esspresso");
		Customer cust3 = new Customer("Keith", "Cappuccinno");
		
		CoffeAttendant coffee = new CoffeAttendant();
		coffee.takeOrder(cust1);
		coffee.takeOrder(cust2);
		coffee.takeOrder(cust3);
		
		coffee.prepareDrink(cust1.getDrinkOrdered());
		coffee.prepareDrink(cust2.getDrinkOrdered());
		coffee.prepareDrink(cust3.getDrinkOrdered());
		//order up
		coffee.callOutCompletedOrder();
		
	}

}
