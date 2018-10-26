package com.nissan.trainingcorejava;

import java.util.*;

public class Arraylistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList <String>();
		
		list.add("Rahul");
		list.add("Varun");
		list.add("Raj");
		list.remove("Rahul");
		ArrayList<String> listone = new ArrayList <String>();
		listone.addAll(list);
		
		Iterator i = list.iterator();
		Iterator m = listone.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(m.hasNext()) {
			System.out.println(m.next());
		}
	}

}
