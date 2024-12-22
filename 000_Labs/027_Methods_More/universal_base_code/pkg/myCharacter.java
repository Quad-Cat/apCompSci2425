/*
 *	Author:  
 *  Date: today
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
	}
	
	// public myCharacter(String role) {
		
	// }
	
	
	//Method(s)
	public void myToString() {
		System.out.println("Your role is " + role);
		
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma " + charisma);
		
	}
	
	public String setRole(String r) {
		if (r.equals("Wizard")) {
			role = "Wizard";
			// strength = 15;
			// dexterity = 0;
			// intelligence = 15;
			// charisma = -10;
			System.out.println("Congradulations on your choice of \"Wizard\"!");
			
		} else if (r.equals("Warrior")) {
			role = "Warrior";
			// strength = 21;
			// dexterity = 0;
			// intelligence = -1;
			// charisma = 0;
			System.out.println("Congradulations on your choice of \"Warrior\"!");
		} else if (r.equals("Rogue")) {
			role = "Rogue";
			// strength = 0;
			// dexterity = 3;
			// intelligence = 2;
			// charisma = 15;
			System.out.println("Congradulations on your choice of \"Rogue\"!");
		} else {
			role = "No role";
			// strength = 0;
			// dexterity = 0;
			// intelligence = 0;
			// charisma = 0;
			System.out.println("That is not a valid role, so you are assinged \"No role\".");
		}
		
		return role;
	}
	
	public int setStrength(int s) {
		if (s <= 0) {
			strength = 0;
		} else {
			strength = s;
		}
		
		return strength;
	}
	
	public int setDexterity(int d) {
		if (d <= 0) {
			dexterity = 0;
		} else {
			dexterity = d;
		}
		
		return dexterity;
	}
	
	public int setIntelligence(int i) {
		if (i <= 0) {
			intelligence = 0;
		} else {
			intelligence = i;
		}
		
		return intelligence;
	}
	
	public int setCharisma(int c) {
		if (c <= 0) {
			charisma = 0;
		} else {
			charisma = c;
		}
		
		return charisma;
	}
	
	public boolean setAll(String ro, int s, int d, int i, int c) {
		
		if  (  (((ro == role) && (strength == s)) && (intelligence == i)) && ((dexterity == d) && (charisma == c))  ) {
			return true;
		}
		
		return false;
		
		// setRole(role);
		// setStrength(s);
		// setDexterity(d);
		// setIntelligence(i);
		// setCharisma(c);
	}
	
	// public boolean acceptValues() {
	// 	if ( (role!="") || () ) 
		
		
	// }
	

}

