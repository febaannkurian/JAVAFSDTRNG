package com.ust.examples;

public class Example11 {
	public  static void displayArray(int a[]) {
		for(int i : a) { //anonymous
			System.out.println(i);
	}
}
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		
		displayArray(new int[] {6,7,8,5});
		}	
	}
