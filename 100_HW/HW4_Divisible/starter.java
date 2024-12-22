//Timofey Tkachev

import java.util.Scanner;

public class starter {
  public static void main(String[] args) {

    Scanner asker = new Scanner(System.in);

    System.out.println("Enter a integer: ");
    int num1 = asker.nextInt();

    System.out.println("Enter another integer: ");
    int num2 = asker.nextInt();

    // first number check divisibility
    if (num1 % 2 == 0) {
      System.out.println(num1 + " is even (divisible by 2)");
    } else {
      System.out.println(num1 + " is odd (not divisible by 2)");
    }

    if (num1 % 3 == 0) {
      System.out.println(num1 + " is divisible by 3");
    }
    if (num1 % 4 == 0) {
      System.out.println(num1 + " is divisible by 4");
    }
    if (num1 % 5 == 0) {
      System.out.println(num1 + " is divisible by 5");
    }
    if ((num1 % 3 != 0) && (num1 % 4 != 0) && (num1 % 5 != 0)) {
      System.out.println(num1 + " is not divisible by 3, 4, or 5");
    }

    System.out.println("");
    // second number check divisibility
    if (num2 % 2 == 0) {
      System.out.println(num2 + " is even (divisible by 2)");
    } else {
      System.out.println(num2 + " is odd (not divisible by 2)");
    }

    if (num2 % 3 == 0) {
      System.out.println(num2 + " is divisible by 3");
    }
    if (num2 % 4 == 0) {
      System.out.println(num2 + " is divisible by 4");
    }
    if (num2 % 5 == 0) {
      System.out.println(num2 + " is divisible by 5");
    }
    if ((num2 % 3 != 0) && (num2 % 4 != 0) && (num2 % 5 != 0)) {
      System.out.println(num2 + " is not divisible by 3, 4, or 5");
    }

  }
}