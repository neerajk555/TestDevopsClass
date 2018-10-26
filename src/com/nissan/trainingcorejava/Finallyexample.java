package com.nissan.trainingcorejava;

public class Finallyexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int datemember = 20/0;
			System.out.println(datemember);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is executed");
		}
	}

}
