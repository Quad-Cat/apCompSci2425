/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			
			System.out.println("Give me an int.");
			int num1 = asker.nextInt();
			
			System.out.println("Give me another number.");
			int num2 = asker.nextInt();
			
			if (num1 == num2) {
				System.out.println("The numbers are the same.");
			} else {
				System.out.println("The numbers are different.");
			}
			
			
		}
		
		
		
	}
}
