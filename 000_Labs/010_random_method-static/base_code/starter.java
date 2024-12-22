/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//random lab
		
		for (int i  = 0; i < 1000; i++) {
			
			
			
		}
		//integer between 0 and 9 inclusive of both
		System.out.println( (int) (Math.random() * 10) );
		
		//integer between 1 and 100 inclusive of both
		System.out.println( (int) ((Math.random() * 99 + 1)) );
		
		//double between 2.5 and 3.5, inclusive of 2.5
		System.out.println( Math.random() + 2.5 );
		
		//double between 14 and 589, inclusive of 14
		System.out.println( Math.random()*575 + 14 );
		
	}
}
