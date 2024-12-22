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
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.print("Please enter you full name: ");
			String name = asker.nextLine();
			
			System.out.print("Your last name is: ");
			System.out.print(name.substring(name.indexOf(" "), name.length()));
			
		}
		
		
	}
}
