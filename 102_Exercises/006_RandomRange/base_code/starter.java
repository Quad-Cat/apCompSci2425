/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers to create a range for your random number");
			System.out.print("Enter a number: ");
			int num1 = asker.nextInt();
			System.out.print("Enter another number (does not have to be bigger, can be smaller): ");
			int num2 = asker.nextInt();
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			System.out.println("Your range is from " + min + " to " + max);
			System.out.println("Here are 5 numbers in that range: ");
			
			for (int i = 0; i<5; i++) {
				System.out.print(((int) (Math.random() * (max - min) + min)) + ", ");
			}
			System.out.print((int) (Math.random() * (max - min) + min));
			
			
		
		}



	}
}
