package com.nissan.trainingcorejava;

import java.util.Arrays;

public class ParallelArraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5,10,5,58,11,100};
		
		for(int i: array) {
			System.out.println(i+" ");
		}
		
		Arrays.parallelSort(array);
		System.out.println("\n Elements after sort");
		
		for(int i:array) {
			System.out.println(i+" ");
		}
	}

}
