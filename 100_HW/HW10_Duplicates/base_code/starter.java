/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("Creating an array of 20 integers...");
		//1
		int[] arr = new int[20];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		
		System.out.println("Filling the array with random ints 1-10...\n\n");
		//2
		//generate random 1-10 number as target number
		int target = (int) (Math.random() * 10 + 1);
		//find duplicates of that number
		System.out.println("Searching duplicates of " + target + " in the array.\n");
		System.out.println("Here are the indexes: ");
		
		int duplicates = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.print(i + ", ");
				duplicates++;
			}
		}
		System.out.println("\nIn total, that was " + duplicates + " duplicates.\n");
		
		
		System.out.println("\nSearching for duplicates at consecutive indexes...");
		//3 - two consecutive numbers in a row
		duplicates = 0;
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i] == arr[i+1]) {
				System.out.println("Duplicates: " + arr[i] + " and " + arr[i+1] + " at indexes " + i + " and " + (i + 1));
				duplicates++;
			}
		}
		if (duplicates == 0)
			System.out.println("There were no duplicates.");
		
		
		
	}
}
