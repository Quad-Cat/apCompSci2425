import java.util.Scanner;

class LectureInput {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			
			System.out.println("What is your name?");
			String name = asker.nextLine();
			System.out.println("Hello " + name);
			
			System.out.println("Give me a number.");
			double number1 = asker.nextDouble();
			asker.nextLine();
			
			System.out.println("Give me another number.");
			double number2 = asker.nextDouble();
			asker.nextLine();
			
			System.out.println("The sum of the two numbers is: " + (number1 + number2));
			
			System.out.println("What is your favorite food?");
			String food = asker.nextLine;
			
		}
		
		
	}
}