/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	//Global variables
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	//Constructors
	public myCharacter() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma " + charisma);
		
	}
	
	public myCharacter(String r) {
		if (r.equals("Wizard")) {
			role = "Wizard";
			strength = 15;
			dexterity = 0;
			intelligence = 15;
			charisma = -10;
			System.out.println("Congradulations on your choice of \"Wizard\"!");
			
		} else if (r.equals("Warrior")) {
			role = "Warrior";
			strength = 21;
			dexterity = 0;
			intelligence = -1;
			charisma = 0;
			System.out.println("Congradulations on your choice of \"Warrior\"!");
		} else if (r.equals("Rogue")) {
			role = "Rogue";
			strength = 0;
			dexterity = 3;
			intelligence = 2;
			charisma = 15;
			System.out.println("Congradulations on your choice of \"Rogue\"!");
		} else {
			role = "No role";
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			charisma = 0;
			System.out.println("That is not a valid role, so you are assinged \"No role\".");
		}
		
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma " + charisma);
		
	}

}

