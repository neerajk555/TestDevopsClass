/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Neeraj K
 *
 */
public class Studentdetails {

	
	int phonenumber = 99; // integer
	String name = "Mahesh"; // string -""
	char lastname = 'a'; // sting - one char at a time in ''
	long phonenumberpincode = 333333;
	float weight = 22.3f;
	boolean condition = true;
	boolean condition_two = false;
	
	int m = 10;
	
	long n = m ;
	
	long number_one= 4444;
	int number_two = (int) number_one; // narrow casting (datatype)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentdetails sd = new Studentdetails();
		//this is a student object
		
	System.out.println(sd.phonenumber); 
	System.out.println(sd.name);
		
	}

}
