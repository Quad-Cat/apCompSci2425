package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three) {
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	
	public static void specialSquare(int findNumSquares) {
		
		int count = 1; //last number added in addition chain 1+2+...+count
		int sum = 1; //total sum of the number chain above
		
		//create array that will store all of the special squares found
		int[] specialSquares = new int[findNumSquares];
		
		for (int i = 0; i<findNumSquares; i++) {
			
			while (Math.sqrt(sum) != (int) Math.sqrt(sum)) {
				count++;
				sum = sum + count;
			}
			
			specialSquares[i] = sum;
			
			count++;
			sum+=count;
		}
		
		
		for (int j = 0; j<specialSquares.length; j++) {
			System.out.println(specialSquares[j]);
		}
		
	}
	
}
