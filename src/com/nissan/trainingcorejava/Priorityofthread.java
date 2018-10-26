package com.nissan.trainingcorejava;

public class Priorityofthread extends Thread {

	public void run() {
		System.out.println("Thread name is:" +Thread.currentThread().getName());
		System.out.println("Thread priority is:" +Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Priorityofthread m1 = new Priorityofthread();
		Priorityofthread m2 = new Priorityofthread();
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
	
		m1.start();
		m2.start();
	}

}
