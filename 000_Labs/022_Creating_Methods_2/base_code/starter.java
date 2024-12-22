/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int power(int x, int y) {
		int result = (int)(Math.pow(x, y));
		return result;
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Gimme an integer");
			int num = asker.nextInt();
			
			System.out.println("What power should I raise it to using my new fancy method?");
			int pow = asker.nextInt();
			
			System.out.println("\nHere is your number: ");
			System.out.println(power(num, pow));
			
		}
		
		
	}
}
