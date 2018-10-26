package com.nissan.trainingcorejava;

public class DaemonThreadclasss extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("the daemon thread is working");
		}
		else {
			System.out.println("user thread is working");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonThreadclasss t1 = new DaemonThreadclasss();
		DaemonThreadclasss t2 = new DaemonThreadclasss();
		DaemonThreadclasss t3 = new DaemonThreadclasss();

	t1.setDaemon(true); // this sets my t1 as daemon
	t1.start();
	t2.start();
	t3.start();
	}

}
