package com.ust.examples;
// Example of switch case

public class Example4 {
	public static void main(String[] args) {
		String color = "red";
		switch(color) {
		
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("go");
			break;
		case "orange":
			System.out.println("ready");
			break;
		default:
			System.out.println("go home");
			break;	
		}	
	}
}
