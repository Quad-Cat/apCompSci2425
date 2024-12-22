/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee DwightSchrute = new Employee(1987, "Dwight", "Schrute", 4416.66);
		
		Employee JimHalpert = new Employee(2474, "Jim", "Halpert", 4416.66);
		
		Employee PamBeesly = new Employee(2011, "Pam", "Beesly", 2250);
		
		Employee MrPoole = new Employee(2000, "Mr", "Poole", 1000000000); //First person in the world with a 1 billion dollar sallary
		
		
		DwightSchrute.raiseSalary(1);
		JimHalpert.raiseSalary(-100); //fired
		PamBeesly.raiseSalary(4);
		MrPoole.raiseSalary(10000);
		
		
		System.out.println("Dwight Schrute\'s salary is now $" + DwightSchrute.getSalary());
		System.out.println("Jim Halpert\'s salary is now $" + JimHalpert.getSalary());
		System.out.println("Pam Beesly\'s salary is now $" + PamBeesly.getSalary());
		System.out.println("Mr Poole\'s salary is now $" + MrPoole.getSalary());
		
		System.out.println("");
		
		System.out.println("Dwight Schrute\'s annual salary is now $" + DwightSchrute.getSalary()*12);
		System.out.println("Jim Halpert\'s annual salary is now $" + JimHalpert.getSalary()*12);
		System.out.println("Pam Beesly\'s annual salary is now $" + PamBeesly.getSalary()*12);
		System.out.println("Mr Poole\'s annual salary is now $" + MrPoole.getSalary()*12);
		
		
	}
}
