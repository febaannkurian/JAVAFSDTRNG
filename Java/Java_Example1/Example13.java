package com.ust.examples;
// switch
public class Example13 {
	
	public static void main(String[] args) {
		char cha = 'b';
		switch(cha)
		{
			case 'd':
				System.out.println("Case1");
				break;
			case 'b':
				System.out.println("Case2");
				break;
			case 'x':
				System.out.println("Case3");
				break;
			case 'y':
				System.out.println("Case4");
				break;
			default:
				System.out.println("Default");		
		}	
	}
}
