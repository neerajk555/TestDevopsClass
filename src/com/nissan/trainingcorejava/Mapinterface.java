package com.nissan.trainingcorejava;

import java.util.*;
public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> map = new Hashtable<Integer,String>();
		
		map.put(100, "Rahul");
		map.put(101, "Nisaan");
		map.put(102, "Mahesh");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
