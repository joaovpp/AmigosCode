package amigoscode;

public class StringLecture {

	public static void main(String[] args) {
		String name = "Joao";
		String surname = "Pereira";
		String fullname = name + " " + surname;
		System.out.println(fullname);
		
		String fullname2 = name.concat(" ").concat(surname);
		System.out.println(fullname2);
	}

}
