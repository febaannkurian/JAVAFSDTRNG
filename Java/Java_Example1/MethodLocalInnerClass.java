package com.ust.examples;

public class MethodLocalInnerClass {
	void outerMethod() {
		System.out.println("Inside Outer Method");
		class Inner {
			
			void innerMethod() {
				System.out.println("Inside Inner method");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass m1 = new MethodLocalInnerClass();
		m1.outerMethod();
	}

}
