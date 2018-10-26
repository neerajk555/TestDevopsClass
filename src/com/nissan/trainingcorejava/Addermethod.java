package com.nissan.trainingcorejava;

class Adder{

	static int add(int a, int b ) {
		return a+b;
	}
	
	// overloading with no of arguments 
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
}
	public class Addermethod{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println(Adder.add(10, 20));
			System.out.println(Adder.add(10, 20, 30));
		}

	}
	

