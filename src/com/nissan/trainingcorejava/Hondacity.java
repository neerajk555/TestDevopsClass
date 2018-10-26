package com.nissan.trainingcorejava;

abstract class Carone{
	
	Carone(){
		System.out.println("this is a constructor");
	}
	
	abstract void run();
	
	void gear() {
		System.out.println("change the gear");
	}
	
	
}

public class Hondacity extends Carone{
	
	void run() {
	
		System.out.println("Running the car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hondacity c = new Hondacity();
			c.run();
			c.gear();
		}
		
	}

