package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	//Global variables
	String name;
	int age;
	String breed;
	
	
	//Constructors
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String n) {
		name = n;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String n, String b) {
		name = n;
		age = 1;
		breed = b;
	}
	
	public Dog(String n, int a) {
		name = n;
		age = a;
		breed = "dog dog";
	}
	
	
	//Methods
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	} 
	
	public boolean isSleeping() {
		return (Math.random() < 0.5);
	}
	
	public void bark() {
		System.out.println(name + " said, \"Bark!! WOOF!! Bark! Bark! Woof!!!\" ");
	}
	
}
