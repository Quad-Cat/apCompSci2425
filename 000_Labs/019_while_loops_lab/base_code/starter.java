/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("What is your name?");
			String name = asker.nextLine();
			
			System.out.println("How many times should I print out your name, " + name + "?");
			int iter = asker.nextInt(); //iter short for iterations
			
			while (iter > 0) {
				System.out.println(name);
				iter--;
			}
			
		}


		
	}
}
