package com.nissan.trainingcorejava;
import java.io.IOException;

public class Testingthrowscl {

	void master() throws IOException{
		throw new IOException("Error has occured");
	}
	void notmaster()throws IOException{
		master();
		
	}
	void puremaster() {
		try {
			notmaster();
		}
		catch(Exception e) {
			System.out.println("The error has been handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testingthrowscl obj = new Testingthrowscl();
	obj.puremaster();
	System.out.println("the other parts");
			
	}

}
