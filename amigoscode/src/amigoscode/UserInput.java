package amigoscode;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Scanner for User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name?");
		
		String userName = sc.next();
		System.out.println("Hello " + userName + "!");
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		int year = LocalDate.now().minusYears(age).getYear();
		System.out.println("You were born in " + year + "!");
		sc.close();
	}

}
