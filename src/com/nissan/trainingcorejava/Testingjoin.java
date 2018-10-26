package com.nissan.trainingcorejava;

public class Testingjoin extends Thread {

	public void run()
	{
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testingjoin t1 = new Testingjoin();
		Testingjoin t2 = new Testingjoin();
		Testingjoin t3 = new Testingjoin();
		t1.start(); //c
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		
		}
		t2.start();
		t3.start();
	}

}
