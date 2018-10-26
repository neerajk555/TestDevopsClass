package com.nissan.trainingcorejava;

public class Throwkeyword {

	static void condition(int number) {
		if(number<10)
			throw new ArithmeticException("is not vaild");
		else
			System.out.println("You can go to college");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		condition(8);
		System.out.println("Othersssssss :P ");
		
	}

}
