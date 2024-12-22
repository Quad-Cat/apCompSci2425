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
		Scanner asker = new Scanner(System.in);
		System.out.println("Gimme a word plz.");
		String word = asker.nextLine();
		
		System.out.println("Here is your word one letter at a time. Have fun lol.");
		
		for (int i = 0; i<word.length(); i++) {
			System.out.print(word.substring(i, i + 1));
		}
		
		System.out.println("\n\nNow every letter on a separate line. Have even more fun lol");
		
		for (int i = 0; i<word.length(); i++) {
			System.out.println(word.substring(i, i + 1));
		}
		
	}
}
