package com.ust.examples;

interface Emp {
	int id = 2101;
	void getid();
}
class ImplClass implements Emp {
	@Override
	public void getid() {
		System.out.println("Employee id is" +id);
	}
}
public class Demo2 {
	
	public static void main(String[] args) {
		ImplClass ob = new ImplClass();
		ob.getid();
		
	}

}
