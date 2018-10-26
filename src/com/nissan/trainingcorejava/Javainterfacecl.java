
package com.nissan.trainingcorejava;

interface draw{ //public and abstract
	void drawsomething();// method body isn't present
	
	default void ink()
	{
		System.out.println("default method");
	}
	
}

interface write{
	void writesomething();
}

public class Javainterfacecl implements draw,write {
	
	@Override
	public void drawsomething() {
	
		System.out.println("this is a method of interface");
	}
	
	public void writesomething() {
		
		System.out.println("written");
	}
	
	public void ink() {
		System.out.println("hello ink");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javainterfacecl objone = new Javainterfacecl();
		
		objone.drawsomething();
		objone.writesomething();
		objone.ink();
	}

}
