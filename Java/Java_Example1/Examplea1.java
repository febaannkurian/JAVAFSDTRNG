package com.ust.examples;

class Bank {
	private int accountNo;
	private String accountName;
	private float accountBalance;
	
	void printBankDetails() {
		System.out.println(accountNo + "\n" + accountName + "\n" + accountBalance);
		
	}
	
	protected void insertBankData(int x, String y, float z) {
		accountNo = x;
		accountName = y;
		accountBalance = z;
	}
}	
class Examplea1 {
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.insertBankData(12345, "megha", 10000);
		
		b1.printBankDetails();
		
	}
}