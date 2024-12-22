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
		
		System.out.println("Tell me something: ");
		String userSaid = asker.nextLine();
		
		System.out.println("\nHello!\nMy name is \"Code\".\nWhat about you?\nHere is what you said before \"" + userSaid + "\" ");
		
	}
}
