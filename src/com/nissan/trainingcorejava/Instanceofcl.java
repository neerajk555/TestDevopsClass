package com.nissan.trainingcorejava;

class ParentInst {
	
}

public class Instanceofcl extends ParentInst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instanceofcl i = new Instanceofcl();
		ParentInst p = new ParentInst();
		
		System.out.println(p instanceof Instanceofcl);
	}

}
