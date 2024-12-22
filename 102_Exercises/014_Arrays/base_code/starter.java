/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int[] arrt = new int[1001];
		 for (int i = 0; i<arrt.length; i++) {
		 	arrt[i] = 3 * (i + 1);
		 }
		 for (int i = 0; i<arrt.length; i++) {
		 	System.out.print(arrt[i] + ", ");
		 }
		 
		 
		 System.out.println("\n\n\n\n\n\n\n");
		 
		 
		 int[] arrb = new int[1001];
		
		 for (int i=0; i<1000; i++) {
		 	arrb[i] = 1000-i;
		 }
		 //for (int i = 0; i<arrb.length; i++) {
		 //	arrb[i] = 1001 - 1;
		 //}
		 for (int i = 0; i<arrt.length; i++) {
		 	System.out.print(arrb[i] + ", ");
		 }
		 
		 
	}
}
