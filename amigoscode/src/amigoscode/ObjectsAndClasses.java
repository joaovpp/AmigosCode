package amigoscode;

public class ObjectsAndClasses {

	public static void main(String[] args) {
		// Objetcs and Classes
		// Class is a template to create new objects
		// String is a template (class) to create the new object
		Lens lensOne = new Lens("sony", "85mm", true);
		Lens lensTwo = new Lens("canon", "30mm", true);
		Lens lensThree = new Lens("sony", "24-70mm", false);
		
		System.out.println("Lens 1");
		System.out.println(lensOne.brand);
		System.out.println(lensOne.focalLength);
		System.out.println(lensOne.isPrime);
		System.out.println();
		
		System.out.println("Lens 2");
		System.out.println(lensTwo.brand);
		System.out.println(lensTwo.focalLength);
		System.out.println(lensTwo.isPrime);
		System.out.println();
		
		System.out.println("Lens 3");
		System.out.println(lensThree.brand);
		System.out.println(lensThree.focalLength);
		System.out.println(lensThree.isPrime);
	}
	
	// this is the blueprint (template) to create lenses
	static class Lens {
		String brand;
		String focalLength;
		boolean isPrime;
		
		// the constructor
		Lens (String brand, String focalLength,boolean isPrime) {
			this.brand = brand;
			this.focalLength = focalLength;
			this.isPrime = isPrime;
		}
	}
}
