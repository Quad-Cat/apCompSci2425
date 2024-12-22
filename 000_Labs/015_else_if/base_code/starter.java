/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Guess my number from 1 to 1000.");
			
			int num = (int) (Math.random() * 999) + 1;
			
			
			if (asker.nextInt() == num) {
				System.out.println("You guessed the number. Good job!");
				
			} else if () {
				System.out.println("No, sorry, that is incorrect. The correct number was " + num);
				
			}
		}
		
		
	}
}
