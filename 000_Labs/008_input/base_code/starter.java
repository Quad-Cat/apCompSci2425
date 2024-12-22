/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			
			System.out.println("What is your name: ");
			String name = asker.nextLine();
			
			System.out.println("How old are you: ");
			int age = asker.nextInt();
			asker.nextLine();
			
			System.out.println("What month were you born in: ");
			String month = asker.nextLine();
			
			System.out.println("What day of the month were you born in: ");
			int day = asker.nextInt();
			asker.nextLine();
			
			System.out.println("What year were you born in: ");
			int year = asker.nextInt();
			asker.nextLine();
			
			System.out.println("How much is a buck fifty: ");
			String buck = asker.nextLine();
			
			
			System.out.println("\nHello " + name + ", the person of " + age + " years of age!");
			System.out.println("You were born on " + month + " " + day + ", " + year + "!");
			System.out.println("In your opinion, a buck fifty is " + buck);
			
		}
		
		
	}
}
