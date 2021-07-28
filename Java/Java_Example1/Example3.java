package com.ust.examples;
// Example of for loop






public class Example3 {
	public static void main(String[] args) {
		//String[] str  = new String[5];
		String[] str = {"ann", "bake", "helen", "alan", "irin"};
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("helen"))
				// break;
				continue;
			System.out.println(str[i]);
		}
	
	}

}
