package com.ust.examples;
// Example of inner class





public class Innerclass {
	 int x = 5;
	
	
	private void display() {
		System.out.println("Outer class");
	}
	
	
	
	public class inner {
		 int y;
//		 x = 4;
//		 Innerclass.inner
		inner(int y) {
			
			this.y = y;
		}
		void display() {
			System.out.println("Example of inner class");
			
		}
	}
	
	public static void main(String[] args) {
		
		Innerclass.inner e1 = new Innerclass().new inner(6);
		Innerclass e2 = new Innerclass();
		e2.display();
		e2.x = 5;
		e1.display();
		System.out.println(e2.x);
		e1.display();
	}
}
