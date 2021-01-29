package amigoscode;

import java.util.*;

public class Teste {

	public static void main(String[] args) {
//		String name;
//		name = "John";
//		System.out.println("Hello " + name.toUpperCase());
//		System.out.println("Hello " + name.toLowerCase());
//		System.out.println("Hello " + name.charAt(0));
		
		// Scanner is used for user input
		Scanner sc = new Scanner(System.in); // creates a constructor of the Scanner class having System.In as an argument
		System.out.println("What's your name? ");
		// receives a string as input
		String name = sc.nextLine();
		
		System.out.println(name.toLowerCase().contains("sh")); // Returns true when name = Josh
		System.out.println("Your name has " + name.length() + " letters!");
		int i;
		for (i = 0; i < name.length(); i++) {
			
			System.out.println(name.charAt(i));
	
		}
	}
	
}
