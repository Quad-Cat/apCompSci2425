/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Cow bob = new Cow();
        Cow betsy = new Cow(192, "Orange", true);
        System.out.println("Bob flavor: " + bob.getFlavor());
        System.out.println("Betsy flavor: " + betsy.getFlavor());
        
        bob.moo();
        betsy.moo();
        
	}
}