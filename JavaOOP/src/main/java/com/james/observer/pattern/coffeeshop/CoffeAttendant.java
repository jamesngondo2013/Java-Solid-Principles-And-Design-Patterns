package com.james.observer.pattern.coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeAttendant {

	private List<WaitingCustomer> waitingCustomerList;
	private List<String> completedDrinks;
	
	public CoffeAttendant() {

		 waitingCustomerList = new ArrayList<WaitingCustomer>();
		 completedDrinks = new ArrayList<String>();
		 
	}
	
	public void takeOrder(Customer cus){
		System.out.println("Waiter: Taking Order for..." + cus.getName() + ", I've started working on your order of "
                + cus.getDrinkOrdered());
		waitingCustomerList.add(cus);
		
	}
	
	public void prepareDrink(String drinkToPrepare){
		
		double timeTaken = Math.random()* 10; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drinkToPrepare);
        } catch (InterruptedException e) {
            System.out.println(" for some reason,"+drinkToPrepare+" drink was not prepared..");
        }
       
	}
	
	public void callOutCompletedOrder(){
		for (String drink : completedDrinks) {
			
			 System.out.println("Order up: " + drink);
			 
			for (WaitingCustomer waitingCustomer : waitingCustomerList) {
				waitingCustomer.orderReady(drink);
			}
		}
		
	}

}
