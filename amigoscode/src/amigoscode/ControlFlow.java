package amigoscode;

public class ControlFlow {

	public static void main(String[] args) {
		// Ternary operator - only when evaluating 1 single boolean expression
		int age = 17;
		String message = age >= 17 ? 
				"I am an adult!": 
			"I am not an adult!";		
		System.out.println(message);
	}
}

