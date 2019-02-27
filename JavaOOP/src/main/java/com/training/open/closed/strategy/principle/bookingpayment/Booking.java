package com.training.open.closed.strategy.principle.bookingpayment;

public class Booking {

	private IPayment pay;
	
	public Booking(IPayment pay) {
		this.pay = pay;
	}

	public void payNow(){
	pay.makePayment();
	}
}
