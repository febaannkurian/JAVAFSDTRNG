package com.ust.examples;

interface FirstInterface {
	public void myMethod();
}
interface SecondInterface {
	public void myOtherMethod();
}
class DemoClass6 implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
		}
	public void myOtherMethod() {
		System.out.println("Some other text..");
	}
}
public class InterfaceMain2 {
	
	public static void main(String[] args) {
		DemoClass6 myObj = new DemoClass6();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}

}
