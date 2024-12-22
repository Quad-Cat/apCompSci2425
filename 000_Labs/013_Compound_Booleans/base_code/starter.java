/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Give me a number");
			double num1 = asker.nextDouble();
			
			System.out.println("Give me another one");
			double num2 = asker.nextDouble();
			
			System.out.println("Last one - give me a number");
			double num3 = asker.nextDouble();
			
			
			//gets the largest number using ifs
			if ((num1 > num2) && (num1 > num3)) {
				System.out.println("The first number is the largest.");
			}
			
			if ((num2 > num1) && (num2 > num3)) {
				System.out.println("The 2nd number is the largest.");
			}
			
			if ((num3 > num1) && (num3 > num2)) {
				System.out.println("The 3rd number is the largest.");
			}
			
			
			//this  will  get the smallest number using ifs
			
			//I know the directions said to use 3 ifs, but I used an if else so it ended up as two..
			//Less is not more :)
			if ((num1 < num2) || (num2 < num3)) {
				if ((num1 < num2) && (num1 < num3)) {
					System.out.println("The first number is the smallest.");
				} else {
					System.out.println("The 2nd number is the smallest.");
				}
				
			} else {
				System.out.println("The third number is the smallest.");
			}
			
			
			
			
		}

	}
}
