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
		role = "Wizard";
		strength = 5;
		dexterity = 4;
		intelligence = 8;
		charisma = 4;
	}
	
	//Methods
	public String role() {
		return role;
	}
	
	public int strength() {
		return strength;
	}
	
	public int dexterity() {
		return dexterity;
	}
	
	public int intelligence() {
		return intelligence;
	}
	
	public int charisma() {
		return charisma;
	}
	
}

