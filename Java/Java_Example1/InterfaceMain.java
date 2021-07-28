package com.ust.examples;

interface Animal3 {
	public void animalSound();
	public void sleep();
}

class Pig1 implements Animal3 {
	public void animalSound() {
		System.out.println("The pig says wee wee");
	}
	
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class InterfaceMain {
	
	public static void main(String[] args) {
		Pig1 myPig = new Pig1();
		myPig.animalSound();
	}

}
