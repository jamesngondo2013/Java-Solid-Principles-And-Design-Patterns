package com.james.interfac.segragation.principle;

public class CashPayment implements IPayment{

	private String address;
	private String name;
	private double amount;
	
	public CashPayment(String address, String name, double amount) {
		super();
		this.address = address;
		this.name = name;
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}


	public double getAmount() {
		return amount;
	}

	public void savePaymentDetails() {
		System.out.println("Saving payment details...name, address, amount" + getName() +" " + getAddress()+" "+getAmount() );
		
	}

	

}
