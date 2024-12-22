/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		try (Scanner asker = new Scanner (System.in)) {
			int num = (int)(Math.random() * 1000 + 1);
			int guess = 0;
			
			System.out.println("Welcome to number guesser!");
			System.out.println("Guess the number 1-1000.");
			
			while (true) {
				System.out.println("\nWhat is your guess?");
				guess = asker.nextInt();
				asker.nextLine();
				
				if (guess < num) {
					System.out.println("Nope! TOO LOW.");
				} else if (guess > num) {
					System.out.println("You really think I would think of a number that high?");
					System.out.println("TOO HIGH.");
				} else {
					System.out.println("YAY! You guessed it! Ask Mr. Poole for chocolate as a prize!");
					System.out.println("Use the coupon code \"Please\" to secure your prize.");
				}
				
			}
			
			
			
		}
		
	}
}
