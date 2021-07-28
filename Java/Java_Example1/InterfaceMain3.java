package com.ust.examples;

class Student4 {
	int roll;
	void getData(int p) {
		roll = p;
	}
	void Display() {
		System.out.println("Roll no is:" +roll);
	}
}
class Test7 extends Student4 {
	double p1, p2;
	void PutMarks(double x, double y) {
		p1 = x;
		this.p2 = y;
	}
	void ShowMarks() {
		System.out.println("test1 = " +p1);
		System.out.println("test2 = " +p2);
	}
}

interface Sports2 {
	double weight = 50.0;
	void ShowWeight();
}


class Results2 extends Test7 implements Sports2 {
	double total;
	public void ShowWeight() {
		System.out.println("Weight = " + weight);
	}
	void DisplayAll() {
		total = p1 + p2 + weight;
		Display();
		ShowMarks();
		ShowWeight();
		System.out.println("The total is:" +total);
	}
}
public class InterfaceMain3 {
	
	public static void main(String[] args) {
		Results2 res = new Results2();
		res.getData(101);
		res.PutMarks(55.5, 77.8);
		res.DisplayAll();
	}

}
