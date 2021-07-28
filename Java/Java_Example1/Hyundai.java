package com.ust.examples;
// Abstract class
abstract class Car {	 
	int x;
	abstract void insuranceDetails();
	void display() {}
	
}









public class Hyundai extends Car {
	
	void insuranceDetails() {
		System.out.println("Please provide the insurance details");
	}
	
	
	public static void main(String[] args) {
//		Car c = new Car();
		Hyundai h = new Hyundai();
		Car c = new Hyundai();
//		Hyundai h1 = new Car();
		c.insuranceDetails();
		h.insuranceDetails();
		
	}

}
