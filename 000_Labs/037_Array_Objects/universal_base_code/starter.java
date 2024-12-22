/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	
	public static int fightWizard;
	public static int fightWarrior;
	
	public static Wizard[] wizards;
	public static Warrior[] warriors;
	
	public static void main(String args[]) {
		//create 100 wizards
		wizards = new Wizard[100];
		for (int i = 0; i<wizards.length; i++) {
			wizards[i] = new Wizard();
		}
		
		//create 100 warriors
		warriors = new Warrior[100];
		for (int i = 0; i<warriors.length; i++) {
			warriors[i] = new Warrior();
		}
		
		
		fightWizard = 0;
		fightWarrior = 0;
		
		while (!fightOver()) {
			wizards[fightWizard].attack(warriors[fightWarrior]);
			if (warriors[fightWarrior].isDead()) {
				fightWarrior++;
			}
			
			if (fightOver()) {
				System.out.println("\nFight over! Wizards won with " + (wizards.length - fightWizard) + " wizards left");
				break;
			}
			
			warriors[fightWarrior].attack(wizards[fightWizard]);
			if (wizards[fightWizard].isDead()) {
				fightWizard++;
			}
			
			if (fightOver()) {
				System.out.println("\nFight over! Warriors won with " + (warriors.length - fightWarrior) + " warriors left");
				break;
			}
			
		}
		
	}
	
	public static boolean fightOver() {
		if ((fightWarrior == warriors.length - 1) || (fightWizard == wizards.length - 1))
			return true;
		else
			return false;
	}
	
}
