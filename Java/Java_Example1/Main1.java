package com.ust.examples;

abstract class Animal1 {
	abstract void makeSound();
}
class Dog1 extends Animal1 {
	public void makeSound() {
		System.out.println("Bark bark");
	}
}
class Cat extends Animal1 {
	public void makeSound() {
		System.out.println("Meows");
	}
}
public class Main1 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.makeSound();
		Cat c1 = new Cat();
		c1.makeSound();
	}
}
