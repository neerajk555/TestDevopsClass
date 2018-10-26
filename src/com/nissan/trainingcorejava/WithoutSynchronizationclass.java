package com.nissan.trainingcorejava;

class Print {
	void printValue(int a) {
		synchronized(this) {
		for(int i=1; i<=5;i++) {
			System.out.println(a*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	}
}

class Threadone extends Thread{
	Print p;
	Threadone(Print p){
		this.p =p;
	}
	
	public void run() {
		p.printValue(5);
	}
}

class Threadtwo extends Thread{
	Print p;
	Threadtwo(Print p){
	this.p=p;
	}
	
	public void run() {
		p.printValue(100);
	}
}



public class WithoutSynchronizationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Print obj = new Print();
		Threadone t1 = new Threadone(obj);
		Threadtwo t2 = new Threadtwo(obj);
	
		t1.start();
		t2.start();
	}

}
