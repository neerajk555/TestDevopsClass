package com.nissan.trainingcorejava;

public class Threassleepmethod extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threassleepmethod t1 = new Threassleepmethod();
		Threassleepmethod t2 = new Threassleepmethod();
		
		t1.start();
		t2.start();
		
	}

}
