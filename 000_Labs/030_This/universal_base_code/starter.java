/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf cat1 = new PooleDwarf("A", 1);
		PooleDwarf cat2 = new PooleDwarf("B", 2);
		PooleDwarf cat3 = new PooleDwarf("C", 3);
		PooleDwarf cat4 = new PooleDwarf("D", 4);
		PooleDwarf cat5 = new PooleDwarf("A", 5);
		PooleDwarf cat6 = new PooleDwarf("F", 6);
		PooleDwarf cat7 = new PooleDwarf("A", 7);
		
		int duplicates = 0;
		// String dwarfName = "";
		
		// for (int i = 2; i<7; i--) {
		// 	dwarfName = "cat" + i;
			
		// 	if (cat1.isSameName(dwarfName.getName())) {
		// 		duplicates++;
		// 	}
		// }
		
		
		if (cat1.isSameName(cat2.getName())) {
			duplicates++;
		}
		if (cat1.isSameName(cat3.getName())) {
			duplicates++;
		}
		if (cat1.isSameName(cat4.getName())) {
			duplicates++;
		}
		if (cat1.isSameName(cat5.getName())) {
			duplicates++;
		}
		if (cat1.isSameName(cat6.getName())) {
			duplicates++;
		}
		if (cat1.isSameName(cat7.getName())) {
			duplicates++;
		}
		
		System.out.println("There were " + duplicates + " dwarfs with the same name as the first one.");
		
	}
}
