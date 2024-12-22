/*
 *	Author: Timofey Tkachev
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	    String play;
	    int money = 100;
	    int num1 = 0;
	    int num2 = 0;
	    int num3 = 0;
	    int wager = 0;
	    
	    Scanner asker = new Scanner(System.in);
	    
	    System.out.println("Slot Machine Rules: ");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("	a. If two numbers match, you double your money.");
        System.out.println("	b. If three numbers match, you triple your money.");
        System.out.println("	c. If none match, you lose your money.");
        System.out.println("--------------------------------------------------\n");
	    
		while (true) {

	      System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
	      play = asker.nextLine();
	
	      if (play.equalsIgnoreCase("no")) {
	        System.out.println("Sad to see you go. YOu have $" + money + ". Come back soon!");
	        System.exit(0);
	      } else if (play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")) {
	        
	        while (wager <= 0 || wager >= money) {
	          System.out.print("You have $" + money + ". How much would you like to wager? ");
	          wager = asker.nextInt();
	          asker.nextLine();
	          
	          if (wager > money) {
	            System.out.println("You don't have that much. No betting loans!");
	          } else if (wager <= 0) {
	            System.out.println("Sneaky! No betting nothing or negatives!");
	          } else {
	            break;
	          }
	        }
	        
	        System.out.println("\nGreat! Let\'s play!\nYour rolls are:");
	
	        num1 = (int) (Math.random() * 10 + 1);
	        num2 = (int) (Math.random() * 10 + 1);
	        num3 = (int) (Math.random() * 10 + 1);
	        
	        System.out.println("_______________________");
	        System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
	        System.out.println("_______________________");
	        if (num1 == num2 && num2 == num3) {
	          money = money - wager + wager * 3;
	          System.out.println("JACKPOT! Your wager has been tripled.");
	          System.out.println("You now have $" + money + ".");
	          
	        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
	          money = money - wager + wager * 2;
	          System.out.println("You won! Your wager has been doubled!");
	          System.out.println("You now have $" + money + ".");
	          
	        } else {
	          money = money - wager;
	          System.out.println("You didn't win this time. Better luck next time!");
	          System.out.println("You now have $" + money + ".");
	        }
	
	        System.out.println("--------------------------------------------------\n");
	        wager = 0;
	        
	        
	        if (money == 0) {
	          System.out.println("You've run out of money. Come back when you get more!");
	          System.exit(0);
	        }
	        
	      } 
		}
		
		
	}
}