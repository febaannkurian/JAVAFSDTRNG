package com.ust.examples;

public class Example19 {
	public static void main(String[] args) {
		double array[] = {10, 20, 30, 40, 50};
		double sum = 0.0;
		double avg = 0.0;
		for(int i = 0; i < array.length; i++) {
			sum = sum +array[i];
		}
		
		avg = sum/array.length;
		
		System.out.println("Average:" +avg);
	}


public static int largest(int[] array) {
	int max = 0;
	max = array[0];
	
	for(int i = 1; i < array.length; i++) {
		if(max < array[i])
			max = array[i];
		System.out.println(max);
	}
	return max;
}
}