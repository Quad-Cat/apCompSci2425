/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner asker = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = asker.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("\nWhat action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = asker.nextLine();
			System.out.println();
			
			// Your code goes here.
			if (choice.equals("file")) {
				System.out.println(textFile);
				
			} else if (choice.equals("print")) {
				printsArray(arr);
				
			} else if (choice.equals("printBack")) {
				printsArrayBack(arr);
				
			} else if (choice.equals("printNum")) {
				System.out.println("How many words do you want to be printed out from the file?");
				printsNumber(arr, asker.nextInt());
				asker.nextLine();
				
			} else if (choice.equals("change")) {
				System.out.println("What text file do you want to swap to? (___.txt in the current directory)");
				textFile = asker.nextLine();
				arr = fillArray(textFile);
				
			} else if (choice.equals("check")) {
				System.out.println("What word/phrase do you want to count in the text file?");
				String checkWord = asker.nextLine();
				System.out.println("The word \"" + checkWord + "\" appears in the text " + checksArray(arr, checkWord) + " times");
				
			} else if (choice.equals("common")) {
				System.out.println(mostCommon(arr));
				
			} else {
				System.out.println("That is not a valid option. Your choices are listed in");
				System.out.println("the parenthases and are case sensitive.");
			}
			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		for (int i = arr.length - 1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		if (num > arr.length) {
			System.out.println("The number is larger than the length of the array. Try again. ");
		}
		
		for (int i = 0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int count = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i].equals(check)) {
				count++;
			}
		}
		return count;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		/*
		NEWEST METHOD. This is the newest and simplest method, the other two version that did not work
		are below. The only problem with this one is that is two words compete for the title of the most
		common, it will not show both, but that is highly unlikely so...
		*/
		String mostCommon = "null"; //most common word, default to null because it has to be initialized to something
		int maxFrequency = 0; //how many times most common word repeated
		int nextFrequency = 0; //this is an extra variable, but it speeds up the code by a lot by removing the need to run checksArray twice
		
		for (int i = 0; i<arr.length; i++) {
			nextFrequency = checksArray(arr, arr[i]);
			if (nextFrequency > maxFrequency) {
				mostCommon = arr[i];
				maxFrequency = nextFrequency;
			}
		}
		
		return "\"" + mostCommon + "\"" + " is the most common word with repeated " + maxFrequency + " number of times.";
		
		
		
		//I have a bad habit of commenting out hundreds of lines of code...
		
		
		/*
		IMPORTANT: SECOND VERSION OF THE CODE WITH 2D ARRAYS
		Almost same thing as with the one below it (1st version), but with many bug fixes and improvements.
		Still did not work tho, got too complicated. I just need the most common, so there is no point in
		creating an array with the frequencies for all of the words in the text. Overcomplicating it. AaAAaAaAa... that took way too long...
		*/
		
		// String [][] commonArr = new String[arr.length][2];  //commonArr [rows] [columns]
		// 												// AKA, frequencies array
		// int lastInitializedIndex = 0;
						
		// 				//previously commonArr[1].length
		// for (int i = 0; i<arr.length; i++) { //fill the array with frequencies
			
		// 	//checksArray(array to check, string to check the array for) - returns int
			
		// 	if (checksArray(commonArr[1], arr[i]) != 0) { //if the i index in text array wasn't counted to the frequencies array, then:
		// 		commonArr[1][lastInitializedIndex] = arr[i]; //adds that word to a new column in the frequencies array
		// 		commonArr[2][lastInitializedIndex] = String.valueOf(checksArray(arr, arr[i])); // +  # times it appears in the row below
		// 		lastInitializedIndex++;															//converts to string becuase it is string array
		// 	}
			
		// }
		
		// int maxFrequency = 0; //max frequency found at that point
		// int maxIndex = 0; //the max frequency number's index
		
		// for (int i = 0; i<commonArr[1].length; i++) {
		// 	if (commonArr[2][i] != null) { //catch null s to not get erros from parseInt
		// 		if (Integer.parseInt(commonArr[2][i]) > maxFrequency) { //converts the commonArr cell into int to compare
		// 			maxFrequency = Integer.parseInt(commonArr[2][i]); //converts to int
		// 			maxIndex = i;
		// 		}
		// 	}
		// }
		
		
		/*
		IMPORTANT: THE METHOD IMPLIMINATION BELOW DOES NOT WORK BECAUSE THE 2D ARRAY HAS TO
		BE A STRING ARRAY TO STORE THE WORDS, BUT ALSO SUPPORT NUMBERS TO COUNT. The new
		implimintation above uses two arrays to do the same thing, with the index of the count
		being the same as the index of the word in the first array
		*/
		
		// String [] commonArr = new String[arr.length][2];  //commonArr [rows] [columns]
		// int lastInitializedIndex = 0;
		
		// for (int i = 0; i<commonArr[1].length; i++) { //fill the array with frequencies
			
		// 	if (checksArray(commonArr, arr[i]) == 0) {
		// 		//initialize a new column for the new word
		// 		commonArr[1][lastInitializedIndex] = arr[i];
		// 		commonArr[2][lastInitializedIndex] = 1;
				
		// 	} else {
		// 		for (int j = 0; j<commonArr.length; j++) {
		// 			if (commonArr[1][j].equals(arr[i])) { //find the corrent column num for that word
		// 				commonArr[2][j] = commonArr[2][j] + 1; //change the num counter in the second row for that word by 1
		// 			}
		// 		}
		// 	}
			
		// }
		
		// for (int i = 0; i<commonArr[1].length; i++) {
		// 	int maxFrequency = 0; //max frequency found at that point
		// 	int maxIndex = 0; //the max frequency number's index
			
		// 	if (commonArr[2][i] > maxFrequency) {
		// 		maxFrequency = commonArr[2][i];
		// 		maxIndex = i;
		// 	}
		// }
		
		
		
		//OLD RETURNS
		
		//String returnMessage = commonArr[1][maxIndex] + " is the most common word with repeated " + maxFrequency + " number of times.";
		
		//return returnMessage;	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
