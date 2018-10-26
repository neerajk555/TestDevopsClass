package com.nissan.trainingcorejava;

import java.util.StringTokenizer;

public class Stringtokerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("my name is nissam"," ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
