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
        } else if (input.equals("Warrior") || input.equals("warrior")) {
          role = "Warrior";
        } else if (input.equals("Rogue") || input.equals("rogue")) {
          role = "Rogue";
        } else {
          System.out.println("That is not a valid role.");
        }

      }

      System.out.println("Your role is " + role + ".");
      System.out.println("What do you want to name you character?");
      String name = asker.nextLine();
      System.out.println("Your character's name is " + name + ".");
      System.out.println("What is your character's title? For example, the King of the Kingdoms.");
      String title = asker.nextLine();
      System.out.println("Congratulations on your new character, " + name + ", " + title + ".");

      int points = 20;
      System.out.println("Shopping time!");
      System.out.println("Buy the following traits for your character: \n");
      System.out.println("Strength; buff and able to carry larger items - up to 10 points");
      System.out.println("Dexterity; agile and quick movements - up to 10 points");
      System.out.println("Intelligence; better at magic spells - up to 10 points");
      System.out.println("Charisma; how personable - up to 10 points");

      String pick = "none";
      int traitPower = 0;
      int strength = 0;
      int dexterity = 0;
      int intelligence = 0;
      int charisma = 0;

      while (points > 0) {
        while (pick.equals("none")) {
          System.out.println("\nYou have " + points + " points to spend. What trait do you want?");

          pick = asker.nextLine();

          traitPower = 0;
          int powerPick = 0;
          while (traitPower == 0) {
            System.out.println("How many points do you want to spend on this trait? The more points spent, the more powerful this trait will be.");
            powerPick = asker.nextInt();

            if ((points >= powerPick) && (powerPick <= 10)) {
              traitPower = powerPick;

            } else if (powerPick > points) {
              System.out.println("You don't have enough points to spend that many.");

            } else {
              System.out.println("The max power for a trait is 10.");
            }

          }
          asker.nextLine();

          if (pick.equals("Strength") || pick.equals("strength")) {
            if (strength + traitPower <= 10) {
              points = points - traitPower;
              strength = strength + traitPower;
              System.out.println("You picked strength at " + traitPower + " trait power.");
            } else {
              System.out.println("This action will exceed the 10 points max for each trait.");
            }

          } else if (pick.equals("Dexterity") || pick.equals("dexterity")) {
            if (dexterity + traitPower <= 10) {
              points = points - traitPower;
              dexterity = dexterity + traitPower;
              System.out.println("You picked dexterity at " + traitPower + " trait power.");
            } else {
              System.out.println("This action will exceed the 10 points max for each trait.");
            }

          } else if (pick.equals("Intelligence") || pick.equals("intelligence")) {
            if (intelligence + traitPower <= 10) {
              points = points - traitPower;
              intelligence = intelligence + traitPower;
              System.out.println("You picked intelligence at " + traitPower + " trait power.");
            } else {
              System.out.println("This action will exceed the 10 points max for each trait.");
            }

          } else if (pick.equals("Charisma") || pick.equals("charisma")) {
            if (charisma + traitPower <= 10) {
              points = points - traitPower;
              charisma = charisma + traitPower;
              System.out.println("You picked charisma at " + traitPower + " trait power.");
            } else {
              System.out.println("This action will exceed the 10 points max for each trait.");
            }

          } else {
            System.out.println("That is not a valid trait. Please pick again.");
          }

        }
        pick = "none";

      }

      System.out.println("\n\n\nHere are your charater's stats: \n");
      System.out.println("Name: " + name + " " + title);
      System.out.println("Role: " + role);
      System.out.println("Strength: " + strength);
      System.out.println("Dexterity: " + dexterity);
      System.out.println("Intelligence: " + intelligence);
      System.out.println("Charisma: " + charisma);

    }

  }
}
