/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			
			System.out.println("Welcome to digital alarm clock!\n");
			
			int day = 100;
			int trynum = 0;
			
			while ((day != 7) && (day != 1) && (day != 2) && (day != 3) && (day != 4) && (day != 5) && (day != 6)) {
				
				if (trynum >= 1) {
					System.out.println("Sorry, but I did not understand that input.");
				}
				
				System.out.println("Please tell me, what day of the week is it? \n1 - Monday\n2 - Tuesday\n3 - Wednesday\n4 - Thursday\n5 - Friday\n6 - Saturday\n7 - Sunday");
				
				day = asker.nextInt();
				
				trynum++;
			}
			
			if (day <= 5) {
				System.out.println("\nWake up at 7:00am today!");
				
			} else {
				System.out.println("\nWake up at 10:00am today!");
				
			}
			
			
			
		}



	}
}




/*
Please tell me, what day of the week is it?
1 - Monday
2 - Tuesday
3 - Wednesday
4 - Thursday
5 - Friday
6 - Saturday
7 - Sunday
*/


// 