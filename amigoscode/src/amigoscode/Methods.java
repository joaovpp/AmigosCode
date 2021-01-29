package amigoscode;

public class Methods {

	public static void main(String[] args) {
		// Methods - block of code that only runs when are called
		
		System.out.println("Hello!"); //this is a method
		
		char[] letters = {'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};
		
		int count = countOccurrences(letters, 'D');
		System.out.println("The letter 'D' appears " + count + " times!");
		
		int count2 = countOccurrences(letters, 'N');
		System.out.println("The letter 'N' appears " + count2 + " times!");
	}
	
	// creating our own method
	public static int countOccurrences(char [] letters, char searchLetter) {
		
		int count = 0;
		for (char letter: letters) {
			if (letter == searchLetter) {
				count++;
			}
		}
		return count;
	}
}
