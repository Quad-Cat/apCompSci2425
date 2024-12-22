/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		try (Scanner asker = new Scanner(System.in)) {
			System.out.print("Please enter a phrase: ");
			String sentence = asker.nextLine();
			
			int numWords = 0;
			for (int i = 0; i<sentence.length(); i++) { //find the number of words
				//System.out.print(sentence.substring(i, i+1) + "-"); --used for debugging
				//System.out.println(sentence.substring(i, i+1).equals(" ")); --used for debugging
				if (sentence.substring(i, i+1).equals(" ")) {
					numWords++;
				}
			}
			numWords++;
			
			//create an array with all of the words in the phrase
			
			int nextIndex = 0; //next available index where the next word should be placed
			String nextWord = "";
			
			//System.out.println("\nNum words in array: " + numWords + "\n"); -- used for debugging
			String [] arrWords = new String[numWords]; //use the number of words for the array length
			
			for (int i = 0; i<sentence.length(); i++) {
				String nextLetter = sentence.substring(i, i+1);
				if (nextLetter.equals(" ")) {
					arrWords[nextIndex] = nextWord;
					nextIndex++;
					nextWord = "";
				} else {
					nextWord = nextWord + nextLetter;
				}
			}
			arrWords[nextIndex] = nextWord;
			
			
			//print the array with the words backwards
			for (int i = arrWords.length; i>0; i--) {
				System.out.print(arrWords[i-1] + " ");
			}
			
			
		}
	}
}
