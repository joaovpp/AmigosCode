package amigoscode;

import java.util.Arrays;

public class WorkingWithArray {

	public static void main(String[] args) {
		// Arrays
		int two = 2;
		int one = 1;
		
		int [] numbers = new int[2];
		numbers[0] = two;
		numbers[1] = one;
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		// Other possibilitie
		int [] numbers2 = {2,3,4};
		System.out.println(Arrays.toString(numbers2));
		System.out.println(numbers2.length);
		
		// arrays of Strings
		String [] names = {"Ali", "Maria"};
		System.out.println(Arrays.toString(names));
	}

}
