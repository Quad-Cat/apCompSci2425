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
		
		myCharacter empty = new myCharacter();
		
		System.out.println("Role - " + empty.setRole("Wizard"));
		System.out.println("Strength - " + empty.setStrength(6));
		System.out.println("Dexterity - " + empty.setDexterity(7));
		System.out.println("Inteligence - " + empty.setIntelligence(8));
		System.out.println("Charisma - " + empty.setCharisma(9));

		System.out.println("\n\n");
		
		
		if (empty.setAll("Wizard", 6, 7, 8, 9)) {
			System.out.println("Everything works. YAY!!!!!!!!!!!!!\nHere are your final stats:\n\n");
		} else {
			System.out.println("Errors.");
		}
		
		empty.myToString();
	}
}
