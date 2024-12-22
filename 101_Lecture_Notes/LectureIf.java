/* 
    Lecture note example - If Statements
*/

class LectureIf{
    public static void main(String args[]) {
        
        try (Scanner asker = new Scanner(System.in)) {
            
            While (true) {
                
                
                System.out.println("Welcome to the adventure game. Choose an alien:");
                System.out.println("1. Lazy alien Bob that eats pizza");
                System.out.println("2. Joe is an alien that eats butterflies");
                System.out.println("3. Barney is an alien that goes to school");
                System.out.print("Enter a number 1-3:");
                int select = asker.nextInt();
                
                if (select == 1) {
                    String alien = "Bob";
                } else if (select == 2) {
                    String alien = "Joe";
                } else if (select == 3) {
                    String alien = "Barney";
                } else {
                    String alien = "Jerry";
                }
                /////
                if (alien == Jerry) {
                    System.out.println("You did not choose an alien, so you get Jerry.");
                } else {
                    System.out.println("Congradulations on your choice of the alien " + alien);
                }
                /////
                if (alien == "") {
                    System.out.println("");
                    
                } else if (alien == "")  
                    
                    
                    
                    
            }
            
            
        }
    
    
	}
}