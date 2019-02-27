package com.james.interfac.segragation.principle;

/*
 * Interface Segragation Principle - It says "any client should not be forced to implement
 * any interface which is irrelevant to it."
 * For example CashPayment class cannot implement ICardPayment interface which has a method saveCardDetails(),
 * rather we will have to create another interface IPayment that will have the method savePaymentDetails()
 * where CashPayment can implement this and also CardPayment class, PaypalPayment class 
 */

public class ClientRunner {

	public static void main(String[] args) {
		
	}
	
}

