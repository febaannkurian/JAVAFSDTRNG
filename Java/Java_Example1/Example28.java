package com.ust.examples;

class CreditCards {
	private String cardName; //Instance variables
	private int expiryDate;
	private float creditBalance;
	
	CreditCards() {
		cardName = "Feba";
		expiryDate = 12/12/2025;
		creditBalance = 5500;
	}
	
	void checkBalance() {
		if(creditBalance > 4000) {
			System.out.println("Sufficient balance");
		}
		else {
			System.out.println("Not much");
		}
	}
	void makePayment() {}
}

// visa is subclass
class Visa extends CreditCards {
	float interestRate;
	float creditLimit;
	
	Visa(String x, int y, float z) {
		super();
		
	}
	void checkDiscounts() {
		System.out.println("Many discounts will be provided");
	}
}

//Mastercard is subclass
class Mastercard extends CreditCards {
	void checkPaymentOptions() {
		System.out.println("Online payment mode");
	}
}

public class Example28 {
	public static void main(String[] args) {
		Visa v = new Visa("Feba", 123, 567f);
		v.checkBalance();
	}

}
