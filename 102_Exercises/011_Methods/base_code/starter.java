/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int year){
		// if (year%4==0) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		
		return (year%4==0);
	}
	
	
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	public static int getDigitSum(int num) {
		int total = 0;
		
		for (int i = 5; i >= 1 ;i--) {
			total = total + num % 10;
			num = num / 10;
		}
		return total;
	}
	
	
	
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void printIfConsecutive(int a, int b, int c) {
		if ((a + 1 == b) && (b + 1 == c)) {
			System.out.println("The intergers are consecutive.");
		} else {
			System.out.println("The numbers are not consecutive.");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
