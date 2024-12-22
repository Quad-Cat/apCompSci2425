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
		
		System.out.println("Here are your character stats: ");
		myCharacter player = new myCharacter();
		System.out.println("Role: " + player.role());
		System.out.println("Strength: " + player.strength());
		System.out.println("Dexterity: " + player.dexterity());
		System.out.println("Intelligence: " + player.intelligence());
		System.out.println("Charisma: " + player.charisma());
		
	}
}
