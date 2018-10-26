package com.nissan.trainingcorejava;

public class Finalvariable {
	
	final int speedlimit = 90;
	
	void run() {
		
		//speedlimit = 100; // final variable cannot be replaced or changed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finalvariable obj = new Finalvariable();
		
		obj.run();
	}

}
