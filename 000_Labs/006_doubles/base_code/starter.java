/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Enter temperature in Fahrenheit:");
			double f = asker.nextDouble();
			double c = (f-32)*5/9;
			System.out.println("In Celsius, that would be " + c + " degrees.");
		}

	}
}
