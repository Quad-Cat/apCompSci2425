/*
 *	Author:  Timofey Tkachev
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
  public static void main(String args[]) {

    try (Scanner asker = new Scanner(System.in)) {
      System.out.println("Welcome to this game!");
      String role = "none";
      String input;

      while (role.equals("none")) {
        System.out.println("Pick your role: Wizard, Warrior, or Rogue");
        input = asker.nextLine();
        
        if (input.equals("Wizard") || input.equals("wizard")) {
          role = "Wizard";
        } else if (input.equals("Warrior") || input.equals("warior")) {
          role = "Warrior";
        } else if (input.equals("Rogue") || input.equals("rogue")) {
          role = "Rogue";
        } else {
          System.out.println("That is not a valid role.");
        }

      }

      System.out.println("Your role is " + role + ".");

    }

  }
}
