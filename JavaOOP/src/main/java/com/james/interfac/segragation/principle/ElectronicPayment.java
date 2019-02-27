package com.james.interfac.segragation.principle;

public abstract class ElectronicPayment implements ICardPayment, IPayment{

	private String cardType;
	private String bankName;
	private double amount;
	private String name;
	private String address;
	
	public ElectronicPayment(String cardType, String bankName, double amount, String name, String address) {
		super();
		
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
