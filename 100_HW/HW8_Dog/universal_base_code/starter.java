/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog cooper = new Dog("Cooper");
		cooper.setAge(489);
		
		Dog zhuchka = new Dog("Zhuchka", "doggie");
		
		if (cooper.isSleeping()) {
			System.out.println("You're dog is sleeping. Don't be loud.");
			
		} else {
			cooper.bark();
			
			if (zhuchka.isSleeping()) {
				zhuchka.bark();
			} else {
				zhuchka.bark();
			}
			
		}
		
	}
}
