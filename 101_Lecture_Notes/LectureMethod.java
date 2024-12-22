/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greetings("cat");
        
        double num = raise(200000.42, 5);
        System.out.println(num);
        raise(num, 5);
        
	}
	
	public static void printAnimal() {
	    System.out.println("  |\\__/,|   (`\\");
	    System.out.println("_.|o o  |_   ) )");
	    System.out.println("-(((---(((--------");
	    
	}
	
	public static void greetings(String name) {
	    
	    System.out.println("Hello, " + name + "!");
	    
	}
	
	public static double raise(double sallary, int percent) {
	    return (sallary * (percent/100));
	}
	
}