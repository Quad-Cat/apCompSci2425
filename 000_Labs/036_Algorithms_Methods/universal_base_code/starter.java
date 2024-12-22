/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] iarr) {
		
		for (int i = 0; i<iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
	}
	
	public static int getArrayAverage(int [] iarr) {
		int add = 0;
		
		for (int i = 0; i<iarr.length; i++) {
			add = add + iarr[i];
		}
		
		return (add/iarr.length);
		
	}
	
	public static int getArrayMax(int [] iarr) {
		int max = -1;
		
		for (int i = 0; i<iarr.length; i++) {
			if (iarr[i] > max) {
				max = iarr[i];
			}
		}
		
		return max;
		
	}
	
	public static int getArrayMin(int [] iarr) {
		int min = 101; //something just bigger than the largest values possible
		
		for (int i = 0; i<iarr.length; i++) {
			if (iarr[i]<min) {
				min = iarr[i];
			}
		}
		
		return min;
		
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[100];
		
		//fill array with random numbers
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println("Here is the entire array.");
		toStringArray(arr);
		
		System.out.println("\n\nThe average of the array is " + getArrayAverage(arr));
		
		System.out.println("\n\nThe max of the array is " + getArrayMax(arr));
		
		System.out.println("\n\nThe min of the array is " + getArrayMin(arr));
		
		
		
	}
	
}
