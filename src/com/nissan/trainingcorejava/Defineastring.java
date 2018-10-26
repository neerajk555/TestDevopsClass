package com.nissan.trainingcorejava;

public class Defineastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Nissan";
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(2));
		
		int indexone = s.indexOf("is");
		System.out.println(indexone);
	
		//java string literal 
		
	String ns = String.format("name is %s", s);
	
	System.out.println(ns);
		
		int stringlength = s.length();
		// gives string length.
		
		System.out.println(stringlength);
		
		char ch = s.charAt(2); 
		//returns char value at index 2
		System.out.println(ch);
		
		String sone = new String("Nissan is the company");
		//using the new keyword;
		
		
		
		System.out.println(s);
		System.out.println(sone);
		
		String sp =" Hello String  ";
		System.out.println(sp +"nissan");
		System.out.println(sp.trim()+"nissan");
		
		String c = "India";
		
		System.out.println(c.concat("is a country"));
		
		String joinstring = String.join("-","");
		
		System.out.println(joinstring);
		
		String empty ="";
		String notempty ="is not empty";
		
		System.out.println(empty.isEmpty());
		System.out.println(notempty.isEmpty());
		
		String equalone = "nissanone";
		String equaltwo = "nissanon";
		
		System.out.println(equalone.equals(equaltwo));
	}

}
