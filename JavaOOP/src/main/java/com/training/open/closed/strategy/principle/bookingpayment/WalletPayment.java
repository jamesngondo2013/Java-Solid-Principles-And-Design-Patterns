package com.training.open.closed.strategy.principle.bookingpayment;

public class WalletPayment implements IPayment{

	public void makePayment() {
		System.out.println("Wallet payment...");
		
	}

}
