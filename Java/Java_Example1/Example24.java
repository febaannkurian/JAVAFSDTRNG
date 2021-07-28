package com.ust.examples;
// constructor
public class Example24 {
	
	String fName;
	String lName;
	String city;
	String address;
	int dob;
	float sal;
	
	Example24(String a, String b, String c, String d, int e, float f) { //constructor with  parameters
		fName = a;
		lName = b;
		city = c;
		address = d;
		dob = e;
		sal = f;
	}
	
	void Display() {
		System.out.println(fName + " " + lName + " " + city + " " + address + " " + dob + " " + sal);
		
	}
	

	public static void main(String[] args) {
		Example24 e1 = new Example24("Feba", "Ann", "Tvm", "febz", 17/03/1992, 2500f);
		Example24 e2 = new Example24("niya", "anjali", "Tvm", "niyz", 17/03/1998, 2500f);
		Example24 e3 = new Example24("ann", "irin", "Tvm", "annz", 15/05/1992, 2500f);
		Example24 e4 = new Example24("irin", "niya", "Tvm", "irinz", 18/01/1992, 2500f);
		Example24 e5 = new Example24("devika", "irin", "Tvm", "devz", 17/10/1992, 2500f);
		
		
		Example24 array[] = new Example24[5];
		array[0] = new Example24("Feba", "Ann", "Tvm", "febz", 17/03/1992, 2500f);
		array[1] = new Example24("niya", "anjali", "Tvm", "niyz", 17/03/1998, 2500f);
		array[2] = new Example24("ann", "irin", "Tvm", "annz", 15/05/1992, 2500f);
		array[3] = new Example24("irin", "niya", "Tvm", "irinz", 18/01/1992, 2500f);
		array[4] = new Example24("devika", "irin", "Tvm", "devz", 17/10/1992, 2500f);
		
		for(Example24 e:array) {
			e.Display();
		}
		
	}

}
