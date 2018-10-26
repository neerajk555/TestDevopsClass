package com.nissan.trainingcorejava;

class Animal{
	
	Animal() {
		System.out.println("Animal is eating");
	}
}

class Cheetah extends Animal{
	
	Cheetah() {
		super();//first statemrnt already created by the complier 
		System.out.println("eating deer");
	}
	
}


public class Testsingleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cheetah c = new Cheetah();
		
	}

}
