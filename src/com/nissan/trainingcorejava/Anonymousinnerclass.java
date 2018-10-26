package com.nissan.trainingcorejava;

interface Customer{
	 void name();
}


public class Anonymousinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer() {
			public void name() {
				System.out.println("Customer name is Rajesh");
			}
		};
		
		c.name();
	}

}
