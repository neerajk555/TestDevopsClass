package com.nissan.trainingcorejava;

public class Localinnerclass {

	private int data =100;
	
	void showmessage() {
		//Local inner class
		class Localclass{
			void display() {
				System.out.println(data);
			}	
		}
		Localclass I = new Localclass();
		I.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Localinnerclass obj = new Localinnerclass();
		obj.showmessage();
	}

}
