import java.util.Scanner;

class extra {
	public static void main(String args[]) {
	    
	    try (Scanner asker = new Scanner(System.in)) {
	        double x;
	        double y;
	        
	        System.out.println("gimme a number (can be decimal, will be called x)");
	        x = asker.nextDouble();
	        
	        System.out.println("Another one. Also can be a decimal (will be called y)");
	        y = asker.nextDouble();
	        
	        
	        System.out.println( "The one that is bigger is " + Math.max(x, y) );
	        
	        System.out.println( "The square root of y is " + Math.sqrt(y) );
	        
	        System.out.println( "x to the power of y is " + Math.pow(x, y) );
	    }
	    
	    
	}
}