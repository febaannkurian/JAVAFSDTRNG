package com.ust.examples;
 
class Car2 {
	private String carName;
	private String carType;
	public Car2(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	
	private String getCarName() {
		return this.carName;
	}
	class Engine {
		String engineType;
		void setEngine() {
			if(Car2.this.carType.equals("4WD")) {
				
			if(Car2.this.getCarName().equals("Crysler")) {
				this.engineType = "Smaller";
			} else {
				this.engineType = "Bigger";
			}
		} else  {
			this.engineType = "Bigger";
		}
	}
	String getEngineType() {
		return this.engineType;
	}
}
}

public class Innermain1 {
	public static void main(String[] args) {
		Car2 car1 = new Car2("Mazda", "8WD");
		Car2.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine type for 8WD = " + engine.getEngineType());
		
		Car2 car2 = new Car2("Crysler", "4WD");
		Car2.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
	
	
	}

}
