/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillan("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillan("The Vulture");
		
		System.out.println("The villan is " + z.getVillan);
		
		
		Spiderman a = new Spiderman("Tommmy Holland", 28);
		a.setVillan("The Vultures");
	}
}
