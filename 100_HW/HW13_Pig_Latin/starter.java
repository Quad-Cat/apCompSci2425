/*
   * Author: Timofey Tkachev
   * Date: idk
   * Collaborator(s): me
   
   first time I actually saw this to put my name here...
   
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a sentence to translate into Pig Latin.");
			String sentence = input.nextLine();
		
			String pigLatin = ""; //string with the pig latin translation
			
			//find the number of words in the sentence
			int numWords = 0;
			for (int i = 0; i<sentence.length(); i++) {
				if (sentence.substring(i, i+1).equals(" ")) {
					numWords++;
				}
			}
			numWords++;
			
			//create an array for the words with the number of words as the lenght
			String [] arrWords = new String [numWords]; //array with all of the english words that will need to be translated
			
			//put all the words of the sentence into an array
			int nextIndex = 0; //next available array index
			String nextWord = "";
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
			
			//translate into PigLatin, writing to the piglatin variable the translations
			nextIndex = 0;
			nextWord = "";
			for (int i = 0; i<arrWords.length; i++) {
				//If a word starts with a consonant and a vowel...
				if (isVowel(arrWords[i].substring(0,1)) && !(isVowel(arrWords[i].substring(1,2)))) {
					//...put the first letter of the word at the end of the word and add "ay."
					nextWord = arrWords[i].substring(1) + arrWords[i].substring(0,1) + "ay.";
				}
				//If a word starts with two consonants...
				if (!(isVowel(arrWords[i].substring(0,1)) || isVowel(arrWords[i].substring(1,2)))) { //if not __ or __
					//...move the two consonants to the end of the word and add "ay."
					
					 //sets nextWord to the current word with the first letter last
					nextWord = arrWords[i].substring(1) + arrWords[i].substring(0,1);
					//take the resulting nextWord, move the first letter to the last position  and  add -ay.
					nextWord = nextWord.substring(1) + nextWord.substring(0,1) + "ay.";
				}
				//If a word starts with a vowel
				if (isVowel(arrWords[i].substring(0,1))) {
					//add the word "way" at the end of the word
					nextWord = arrWords[i] + "way";
				}
				
				pigLatin = pigLatin + " " + nextWord;
				nextWord = "";
			}
			
			
			//Print the piglatin translation
			System.out.println(pigLatin.substring(1));
			
			/*substring removes the space added by the line:
				pigLatin = pigLatin + " " + nextWord;
			which appears during the first run of the loop
			where the variable pigLatin is empty
			*/
		}
	}
	
	public static boolean isVowel(String character) {
		String [] vowels = {"a", "e", "i", "o", "u"};
		for (int i = 0; i<5; i++) {
			if (vowels[i].equals(character)) {
				return true;
			}
		}
		return false;
	}
	
}
