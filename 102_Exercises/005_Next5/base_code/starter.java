/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			
			//- Take in one integer as input
			System.out.println("Gimme an integer.");
			int num = asker.nextInt();
			asker.nextLine();
			
			
			//- Print out the next 5 integers following the input integer
			System.out.println("Here are the next 5: ");
			
			for (int i = 1; i < 5; i++) {
				System.out.print( (num + i) + ", ");
			}
			System.out.print(num + 5);
			System.out.println();
			
			
			//- Print out the next 5 multiples of the input integer
			System.out.println("Here are the next 5 multiples: ");
			
			for (int i = 1; i < 5; i++) {
				System.out.print( (num * i) + ", ");
			}
			System.out.print(num * 5);
			System.out.println();
			
			
			//- Print out the input integer divided by 100
			double numdouble = num;
			
			System.out.println("Here is your integer divided by 100. Hahahaha");
			System.out.println(numdouble / 100);
			
			//- Print out the input integer divided by 10
			System.out.println("Here is your number divided by 10. Have fun.");
			System.out.println(numdouble / 10);
			
		}

				
		
		
	}
}
