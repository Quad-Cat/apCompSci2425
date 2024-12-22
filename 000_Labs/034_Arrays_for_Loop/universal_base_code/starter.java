/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


/*

!!! PLZ READ !!!

This labs is asking for everything
that the previous lab was asking for,
just with for loops this time, but
even for the last one, I already did
it with for loops, though now that I
am re-reading the directions, I needed
to use while loops. Opps... Imma go
redo that one :)

*/

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int [] arr = new int[1000];
		
		for (int i = 0; i<1000; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		
		for (int i = 0; i<1000; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		
	}
}
