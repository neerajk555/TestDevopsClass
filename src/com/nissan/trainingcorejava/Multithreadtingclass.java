package com.nissan.trainingcorejava;

public class Multithreadtingclass implements Runnable {

	public void run() {
		System.out.println("Running a thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multithreadtingclass t = new Multithreadtingclass();
		
		Thread t1 = new Thread(t);
		t1.start();
		
	}

}
