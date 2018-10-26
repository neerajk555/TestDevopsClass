package com.nissan.trainingcorejava;

public class Garbageocollection {

	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garbageocollection s1 = new Garbageocollection();
		
		Garbageocollection s2 = new Garbageocollection();
	
		s1=null;
		s2=null;
		System.gc();
		System.out.println("sdasd");
	}

}
