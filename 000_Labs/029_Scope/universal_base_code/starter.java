/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		
		String statement = "null";
		if(shrek.isUgly()){
			statement = new String(shrek.getName() + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		
		int count = 0;
		for(int i = 0; i < 5; i++){
			shrek.interact(donkey);
			count++;
		}
		System.out.println("That printed out " + count + " times");

	}
}
