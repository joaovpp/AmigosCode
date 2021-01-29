package amigoscode;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String gender = "female";
		if (gender.equals("FEMALE")) {
			
			System.out.println("I am Female");
			
		} else if (gender.equals("MALE")) {
			
			System.out.println("I am Male");
			
		} else if (gender.equals("PREFER_NOT_SAY")) {
			
			System.out.println("I prefer not to say");
			
		} else {
			System.out.println("Unknown Gender");
			
		}
		// Switch Statement		
		switch (gender) {
		case "FEMALE":
			System.out.println("I am Female");
			break;
		case "MALE":
			System.out.println("I am Male");
			break;
		case "PREFER_NOT_SAY":
			System.out.println("I prefer not to say");
			break;
		default:
			System.out.println("Unknown Gender");
		}

	}

}
