package com.training.open.closed.strategy.principle.bookingpayment;

public class Runner {

	public static void main(String[] args) {
		
		//OPEN/CLOSED  PRINCIPLE
		CashPayment cash = new CashPayment();
		WalletPayment wallet = new WalletPayment();
		CardPayment card = new CardPayment();
		
		Booking book = new Booking(wallet);
		book.payNow();
		
	}

}
