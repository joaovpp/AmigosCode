package amigoscode;

public class WhileLoop {

	public static void main(String[] args) {
		// While Loop
		int count = 0;
		while (count <= 5) {
			System.out.println("Count " + count);
			count++;
		}
		
		// do while loop
		int x = 0;
		do {
			System.out.println("x = " + x);
			x++;
		}
		while (x <= 10);
	}
}
