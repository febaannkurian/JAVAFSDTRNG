package com.ust.examples;
// Strings


public class Example10 {
	
	public static void main(String[] args ) {
		String str = "hello";
		
		String str1 = "hello";
		
		str = "hi";
		System.out.println(str);
		System.out.println(str.concat(str1));
//		str.concat(str1);
//		str.charAt(1);
		
//		System.out.println(str.charAt(1));
		System.out.println(str.length());
		System.out.println(str1.substring(3));
		System.out.println(str.trim());
		System.out.println(str.valueOf(false));
		System.out.println(str.concat(str1));
		System.out.println(str.toUpperCase());
		
	}

}
