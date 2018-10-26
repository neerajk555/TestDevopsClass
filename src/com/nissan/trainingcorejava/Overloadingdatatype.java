package com.nissan.trainingcorejava;


class Adderone{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}


public class Overloadingdatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Adderone.add(10, 20));
		System.out.println(Adderone.add(10.5, 10.5));
		
	}

}
