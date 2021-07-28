package com.ust.examples;
// Methods
public class Example9 {
	
	int x;
	int y;
	
	int calculate(int a, int b) { // a, b are parameters
		return a + b;
	}
	
	float calculate(float a, float b) { // a, b are parameters
		return a + b;
	}
	
	String calculate(String a, String b) {
		return a + b;	
	}
	
	void calculate(String a) {
//		return a + b;	
	}
	
	{
		int z = 5;
		System.out.println(z);
	}
	
	int z = 7;
	public static void main(String[] args) {
		Example9 e = new Example9();
		
		int m = e.calculate(5, 6);
		float n = e.calculate(5.6f, 6.5f);
		
		String o = e.calculate("hello ", "hai");
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		}
	}


