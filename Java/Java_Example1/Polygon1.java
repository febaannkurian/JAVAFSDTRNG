package com.ust.examples;
interface Polygon {
	void getArea(int length, int breadth);
}

class Rectangle2 implements Polygon {
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is" + (length * breadth));
	}
}

class Triangle2 implements Polygon {
	public void getArea(int length, int breadth) {
		System.out.println("The area of the triangle is" + (0.5* (length * breadth)));
	}
}

public class Polygon1 {
	public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2();
		r2.getArea(5, 6);
		Triangle2 t2 = new Triangle2();
		t2.getArea(2, 3);
	}

}
