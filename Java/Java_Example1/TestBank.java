package com.ust.examples;
// abstract example
abstract class Bank_Main {
	abstract int getInterestRate(int x);
}
class HDFC extends Bank_Main {
	int getInterestRate(int x) {
		return x;
	}
}

class ICICI extends Bank_Main {
	int getInterestRate(int y) {
		return y;
	}
}

public class TestBank {
	
	public static void main(String[] args) {
		Bank_Main b = new HDFC();
		System.out.println(b.getInterestRate(2));
		b = new ICICI();
		System.out.println(b.getInterestRate(3));
		
	}

}
