package com.training.open.closed.strategy.principle.bookingpayment;

public class CashPayment implements IPayment{

	public void makePayment() {
		System.out.println("Cash payment...");
		
	}

}
