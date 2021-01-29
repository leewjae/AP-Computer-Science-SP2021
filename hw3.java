public class hw3 {
	
	// HW3. 1 Students!
	// Create a class "Undergraduate" and "Graduate."
	// They should inherit the provided class Student,
	// Do not edit the provided class student.
	// Undergraduate class should have private String attribute "major" and appropriate getter and setter.
	// Undergraduate class should override the method "study" and it should print "studying is fun."
	// Graduate class should have private String attribute "researchingArea"
	// Graduate class should override the method 
	public static class Student {
		private String name;

		public Student(String n) {
			name = n;
		}

		public void study() {
			System.out.println("I love studying!");
		}

		public String getName() {
			return name;
		}

		public void setName(String n) {
			name = n;
		}
	}

	// Create your Undergraduate and Graduate Class Here.
}