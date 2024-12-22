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
		int[] arr = new int[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = 9-i;
		}
		
		for (int i = 0; i<10; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}
}
