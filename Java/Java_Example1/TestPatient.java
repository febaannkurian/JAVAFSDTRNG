package com.ust.examples;
// Encapsulation
class TestPatientData {
	private String name;
	private int age;
	private boolean  vaccine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccine() {
		return vaccine;
	}
	public void setVaccine(boolean vaccine) {
		this.vaccine = vaccine;
		
		if(vaccine == true) {
			System.out.println("Good");
		} else {
			System.out.println("Please get vaccinated as soon as possible");
		}
	}
}

public class TestPatient {

		public static void main(String[] args) {
			TestPatientData t = new TestPatientData();
			t.setVaccine(false);
			
			System.out.println(t.isVaccine());	
		}
}
