/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Wizard");
	int strength = 5;
	int dexterity = 4;
	int intelligence = 8;
	int charisma = 4;
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character myRole = new Character();
		
		System.out.println("Role: " + myRole.role);
		System.out.println("Strength: " + myRole.strength);
		System.out.println("Dexterity: " + myRole.dexterity);
		System.out.println("Intelligence: " + myRole.intelligence);
		System.out.println("Charisma: " + myRole.charisma);
		
	}
}
