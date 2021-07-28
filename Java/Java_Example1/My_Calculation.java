package com.ust.examples;

class Calculation {
	int z;
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the numbers :" + z);
	}
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The Difference is:" + z);
	}
}


// My_Calculation is a subclass
public class My_Calculation extends Calculation{
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product is:" + z);
	}
	
	public static void main(String args[]) {
		int a = 20, b = 10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.Subtraction(a,  b);
		demo.multiplication(a,  b);
		
	}

}
