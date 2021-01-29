package amigoscode;

public class RefPrimitive {

	public static void main(String[] args) {
		// reference type
		Person Alex = new Person("Alex");
		Person Miriam = Alex;
		
		System.out.println("- Before changing Alex");
		System.out.println(Alex.name + " " + Miriam.name);
		
		Alex.name = "Alexander";
		System.out.println("- After changing Alex");
		System.out.println(Alex.name + " " + Miriam.name);
		
		// primitive type
		int a = 10;
		int b = a;
		a = 100;	
		System.out.println("a:" + a + "! b: " + b + "!");
		
		/*
		 Reference data type points to same reference in memory, while
		 primitives don't.
		 */

	}
	
	static class Person {
		String name;
		
		Person(String name) {
			this.name = name;
		}
	}

}
