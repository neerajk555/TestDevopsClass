package com.nissan.trainingcorejava;

public class Javainnerclasses {

	private int datavalue = 100;
	
	class Inner{
		//Member inner class
		void message() {
			
			System.out.println("Value is:" +datavalue);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javainnerclasses obj = new Javainnerclasses();
		Javainnerclasses.Inner in = obj.new Inner();
		
		in.message();
		
	}

}
