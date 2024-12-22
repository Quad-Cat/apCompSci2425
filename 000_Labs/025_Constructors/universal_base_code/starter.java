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
			System.out.println("What character do you want? Your options are:");
			System.out.println(" - Wizard\n - Warrior\n - Rogue\n - No role");
			String roleInput = asker.nextLine();
			
			if (roleInput.equalsIgnoreCase("wizard")) {
				myCharacter player = new myCharacter("Wizard");
				
			} else if (roleInput.equalsIgnoreCase("warrior")) {
				myCharacter player = new myCharacter("Warrior");
				
			} else if (roleInput.equalsIgnoreCase("rogue")) {
				myCharacter player = new myCharacter("Rogue");
				
			} else {
				myCharacter player = new myCharacter();
			}
			
			
		}
		
		
	}
}
