package com.nissan.trainingcorejava;

import java.util.*;
public class Linkedlistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Deque<String> ll = new ArrayDeque<String>();
		
		ll.add("Rahul");
		ll.add("Shankar");
		ll.add("Shub");
		ll.add("Akshay");
		System.out.println("head:" +ll.element());
		System.out.println("head:" +ll.peek());
		
		Iterator<String> i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ll.remove();
		System.out.println("removing");
		Iterator<String> io = ll.iterator();
		while(io.hasNext()) {
			System.out.println(io.next());
		}
		
	}

}
