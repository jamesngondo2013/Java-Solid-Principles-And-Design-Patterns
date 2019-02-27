package com.training.open.closed.strategy.principle.bookingpayment;

public class CardPayment implements IPayment{

	public void makePayment() {
		System.out.println("Card payment...");
		
	}

}
