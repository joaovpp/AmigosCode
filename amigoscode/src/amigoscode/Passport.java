package amigoscode;

import java.time.LocalDate;

public class Passport {

	public static void main(String[] args) {
		// Passport
		PassportTemplate ukPassport = new PassportTemplate("1234", "England (UK)", LocalDate.of(2025, 1, 1));
		PassportTemplate usPassport = new PassportTemplate("9898", "USA (US)", LocalDate.of(2030, 1, 1));

		System.out.println("England Passport: ");
		ukPassport.print();

		System.out.println("US Passport: ");
		usPassport.print();
	}

	static class PassportTemplate {
		String number;
		String country;
		LocalDate expiryDate;

		PassportTemplate (String number, String country, LocalDate expiryDate) {
			this.number = number;
			this.country = country;
			this.expiryDate = expiryDate;
		}

		public void print(){
			System.out.println(this.number);
			System.out.println(this.country);
			System.out.println(this.expiryDate);
			System.out.println();
		}
	}

}
