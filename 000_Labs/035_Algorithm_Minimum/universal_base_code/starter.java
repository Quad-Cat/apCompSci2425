/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		//Create random array
		int [] arr = new int[(int) (Math.random() * 150)+ 51]; //length, random from 51 to 200 inclusive
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; // ints from 1 to 100 inclusive
		}
		
		//Find the min.
		int min = 101; //just enough to be larger than all of the numbers in array
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("The minimum value is " + min);
		
		//Find the max.
		int max = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("The maximum value is " + max);
		
		//Find the average
		int sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		double average = sum / arr.length;
		
		System.out.println("The average is " + average);
		
		//Print how many elements
		System.out.println("There are " + arr.length + " elements in the array.");
		
	}
}
