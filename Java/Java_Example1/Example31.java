package com.ust.examples;

import java.io.File;

public class Example31 {

	public static void main(String[] args) throws IOException, java.io.IOException {
		
		File f = new File("C:\\Users\\ustjava25\\sample.txt");
		if(f.createNewFile()) {
			System.out.println("new file is created");
		} else {
			System.out.println("File already exist");
		}
	}
}
