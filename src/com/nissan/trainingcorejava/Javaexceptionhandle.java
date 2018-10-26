package com.nissan.trainingcorejava;

public class Javaexceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//code that need to be evaluated for erros
			int a[] = new int[5];
			a[5]=30/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("task completed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task of array completed" );
		}
		
		catch(Exception e) {
			System.out.println("Extra stuff");
		}
		System.out.println("other parts of program");
	}

}
