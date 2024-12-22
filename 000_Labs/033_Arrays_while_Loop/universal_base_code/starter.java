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
		
		int [] arr = new int[1000];
		
		int i = 0;
		while (i<1000) {
			arr[i] = (int) (Math.random() * 10);
			i++;
		}
		
		i = 0;
		while (i<1000) {
			System.out.print(arr[i] + ", ");
			i++;
		}
		
		
	}
}
