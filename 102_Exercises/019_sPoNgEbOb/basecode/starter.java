/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.println("Input a sentence to be convered to sponge [bob] case");
			String sentence = asker.nextLine() + " ";
			
			while (true) {
				if(sentence.indexOf(" ") == -1) {
					break;
				}
				int space = sentence.indexOf(" ");
				String word = sentence.substring(0, space);
				System.out.print(spongeCase(word) + " ");
				sentence = sentence.substring(space+1);
			}
			
		}
		
	}
	
	
	public static String spongeCase(String toConvert) {
		String returnWord = "";
		
		int count = 1;
		String output = "";
		
		for (int i = 0; i<toConvert.length(); i++) {
			if (count%2==0) {
				output = output + toConvert.substring(count - 1, count).toUpperCase();
			} else {
				output = output + toConvert.substring(count - 1, count);
			}
			
			count++;
		}
		
		return output;
		
	}
	
	
	
	
}
