package com.ust.examples;
// 
 class Employee {
	int id;
	String name;
	float salary;
	void insert(int i, String n, float s) {
		id = 1;
		name = n;
		salary = s;
	}
	
	void display() { System.out.println(id+ "" +name+ "" +salary);}
	}
	 
	public class Example15 {
		
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(101, " ajeet ", 45000f);
		e2.insert(102, " irfan ", 25000f);
		e3.insert(103, " nakul ", 55000f);
		e1.display();
		e2.display();
		e3.display();		
	}
}
 
