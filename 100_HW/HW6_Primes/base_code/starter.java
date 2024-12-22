/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a) {
		int i = a - 1;
		while (i>=2) {
			if (a%i == 0) {
				return false;
			}
			i--;
		}
		return true;
		
	}

	public static void printPrimes(int b) {
		int count = b;
		while (count>=2) {
			System.out.print(count);
			System.out.print(" - " + checkPrime(count) + "\n");
			count--;
		}
	}
	
	public static void main(String args[]) {
		try(Scanner asker = new Scanner(System.in)) {
			System.out.print("Input a number: ");
			int num = asker.nextInt();
			printPrimes(num);

		}
	}
}
