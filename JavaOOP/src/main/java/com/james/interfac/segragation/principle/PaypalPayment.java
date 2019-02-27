package com.james.interfac.segragation.principle;

public class PaypalPayment extends ElectronicPayment{

	
	
	public PaypalPayment(String cardType, String bankName, double amount, String name, String address) {
		super(cardType, bankName, amount, name, address);
		// TODO Auto-generated constructor stub
	}

	

	public void savePaymentDetails() {
		System.out.println("Saving payment details...name, address, amount" + getName() +" " + getAddress()+" "+getAmount() );
		
	}
	
	public void saveCardDetails() {
		System.out.println("Saving card details...ctype, bank" + getCardType() +" " + getBankName());
		savePaymentDetails();
	}
	
	
}
