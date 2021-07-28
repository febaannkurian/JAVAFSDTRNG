package com.ust.examples;
/** This example depicts the usage of local static and instance variables
 */
public class Example {
	String name; //instance variable
	Float price;
	static int count; //static variable
	
	
	public static void main(String[] args) {
		int age = 10; //local variable
		System.out.println(age);
		Example e = new Example();
		e.name = "Feba";
		count = 7;
		System.out.println(age);
	}
}