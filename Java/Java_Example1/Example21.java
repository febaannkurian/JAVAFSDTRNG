package com.ust.examples;
// constructor
public class Example21 {
	
	
	int x;
	float y;
	String z;
	
	Example21(){} // empty constructor
	Example21(int a, float b) { //constructor with 2 parameters
		this.x = a;
		this.y = b;
	}
	
	
	Example21(int a, float b, String c) {
		this(a,b);
//		x = a;
//		y = b;
		z = c;
	}
	
	
	public static void main(String[] args) {
		Example21 e1 = new Example21();
		
		System.out.println(e1.x);
		Example21 e2 = new Example21(2,3.0f);
		System.out.println(e2.y);
		Example21 e3 = new Example21(3,4.0f, "feba");
		System.out.println(e3.z);
		
		
	}

}
