/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		while (true) {
			System.out.println(c);
			if (c == 10) {
				break;
			}
			c = c + 1;
		}		
		
		
		int count = 0;
		
		while (count < 100) {
			System.out.print("Neato");
			count++;
		}
		
		
		//cloud9 does not have that mcuh terminal space, comment out lines 33-37
		//to see the first two loops
		
		count = 1;
		while (count <= 1000) {
			System.out.println(count);
			count++;
		}
		
		
	}
}
