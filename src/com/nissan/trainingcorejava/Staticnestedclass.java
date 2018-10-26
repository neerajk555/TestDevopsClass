package com.nissan.trainingcorejava;

public class Staticnestedclass {

	static int memberonevalue = 100;
	static class Innerone{
		void displaymember() {
			System.out.println("Value is: " +memberonevalue);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticnestedclass.Innerone obj = new Staticnestedclass.Innerone();
		obj.displaymember();
	}

}
