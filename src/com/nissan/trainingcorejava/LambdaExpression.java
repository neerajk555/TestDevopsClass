package com.nissan.trainingcorejava;

@FunctionalInterface
interface Printdisplay{
	public void display();
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value =100;
		
		
		
		Printdisplay p1=()->{
		
			System.out.println("Print value" +value);
		};
		
		p1.display();
	}
}
