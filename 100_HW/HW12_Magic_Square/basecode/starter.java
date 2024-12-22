import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		//System.out.println(CVMath.findMid(2,3,1));
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("How many \"special squares\" do you want to find?");
			System.out.println("They will be the first [number you enter] \"special squares\".");
			
			int checkUpTo = asker.nextInt();
			
			System.out.println("Here are the requested special squares");
			
			CVMath.specialSquare(checkUpTo);
			
		}

		
	}
}
