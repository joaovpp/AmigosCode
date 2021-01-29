package amigoscode;

public class Loops {

	public static void main(String[] args) {
		// Loops
		int[] numbers = {2,20,70,4,50,6,84,99,3,2};
		
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 70) {
				break;
			}
			System.out.println("The number is: " + numbers[i]);
			System.out.println("The index is: " + i);
		}
		System.out.println("Enhanced for loop: ");
		// this doesnt give you access to the index
		for (int number: numbers) {
			if (number == 50) {
				continue;
			}
			System.out.println(number);
		}
	}
}
