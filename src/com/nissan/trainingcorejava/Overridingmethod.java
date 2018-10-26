package com.nissan.trainingcorejava;

class Vehicle{
	
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Overridingmethod extends Vehicle{
	
	void run() {
		System.out.println("Bike is running too");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overridingmethod obj = new Overridingmethod();
		obj.run();
}

}
