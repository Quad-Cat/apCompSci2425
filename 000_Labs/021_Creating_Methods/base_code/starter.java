/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String str) {
		System.out.println(str);
	}
	
	public static void toStringCombined(String str) {
		System.out.println(str + " " + str);
		
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		try (Scanner asker = new Scanner(System.in)) {
			System.out.print("Just type something: ");
			String something = asker.nextLine();
			
			System.out.println("\n\nHere is what you wrote printed using a fancy method");
			toString(something);
			
			System.out.println("\nHere is what you wrote twice with a space in between.");
			System.out.println("(btw, this is an even fancier method lol)");
			toStringCombined(something);
			
		}
		
		
	}
}
