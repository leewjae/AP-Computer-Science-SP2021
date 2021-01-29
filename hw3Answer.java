public class hw3Answer {

	// HW3. 1 Students!
	// Create a class "Undergraduate" and "Graduate."
	// They should inherit the provided class Student,
	// Do not edit the provided class student.
	// Undergraduate class should have private String attribute "major" and appropriate getter and setter.
	// Undergraduate class should override the method "study" and it should print "studying is fun."
	// Graduate class should have private String attribute "researchingArea" and appropriate getter and setter.
	// Graduate class should override the method "study" and it should print "studying is hard."
	// Graduate class should contain its unique method "research" and it should print the object's specific researching area.
	// For example, if there's two graduate class, g1 with researchingArea "Mathematics" and g2 with researching Area "Physics,"
	// if you implement g1.research(), the program should print "I research Math."
	// Hint: You should declare appropriate constructors to each of the classes
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
	public static class Undergraduate extends Student {
		private String major;

		public Undergraduate() {
			super("");
			major = "";
		}

		public Undergraduate(String n, String m) {
			super(n);
			major = m;
		}

		@Override
		public void study() {
			System.out.println("studying is fun");
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String m) {
			major = m;
		}	


	}

	public static class Graduate extends Student{
		private String researchingArea;

		public Graduate() {
			super("");
			researchingArea = "";
		}

		public Graduate(String n, String r) {
			super(n);
			researchingArea = r;
		}

		@Override
		public void study() {
			System.out.println("studying is hard");
		}

		public String getResearchingArea() {
			return researchingArea;
		}

		public void setResearchingArea(String r) {
			researchingArea = r;
		}

		public void research() {
			System.out.println("I research " + researchingArea);
		}
	}

	// HW3.1 Ends Here


	// HW3. 2 Veheicle, Sedan and Truck
	/*
	Create two classes: Vehicle and Sedan. 
	Sedan will be the derived class from the Vehicle base class.
	For this, think about the one-to-many relationship: All Sedans are Vehicles, 
	but not all Vehicles are Sedans.
	Your Vehicle class should -- at a minimum -- implement this UML below.
	I say "at a minimum" because
	I welcome you to make your class as full and/or as complex as you'd like.
	These are the minimum requirements:
	----------------------------
	Vehicle
	----------------------------
	- year : int
	- mileage : int
	----------------------------
	+ Vehicle()
	+ Vehicle(int, int)
	+ print() : void
	+ setYear(int) : void
	+ setMileage(int) : void
	----------------------------
	Then create a Sedan class that derives from the Vehicle base class. Implement this UML for that class:
	----------------------------
	Sedan :: Vehicle // a :: b means that a inherits b.
	----------------------------
	- doors : int
	- hatchback : bool
	----------------------------
	+ Sedan()
	+ Sedan(int, int, int, bool)
	+ printVehicle() : void
	----------------------------
	Note that the header here implies that a Sedan is a Vehicle, hence the Sedan is the derived class from the Vehicle base class.
	Note the non-default Sedan constructor. It receives four arguments, but the Sedan class has only two member variables.
	The other two arguments are for the Vehicle class.
	Your Sedan implementation file will need to call the necessary public member methods in Vehicle in order to set those two inherited member variables.
	Note the two print methods.
	When you print a Sedan object, it should also print the inherited variables from the Vehicle object
	-- but that print method for printing the Vehicle object data must reside in your Vehicle class specification/definition, not the Sedan class specification/definition.
	Once this is done, write an additional Truck class that derives from the Vehicle class.
	Its private data members will be an integer, towing capacity, and another integer, number of axles. 
	At this point you'll have three classes: Vehicle, Sedan, and Truck.
	You have one more task at this point: add at least one more private data member to each of these three classes, and adjust the Class definitions and constructors as necessary to support this.
	For the Vehicle class, think about some variable or dimension that would apply to all vehicles. For Sedan/Truck, think about variables/dimensions that only apply to Sedans and Trucks. 
	For example, a boat is a vehicle, but a boat doesn't have wheels.
	Therefore "wheels" would be a bad choice to add as a private data member for the Vehicle class, since not all vehicles have wheels. What would apply?
	Write a short program that demonstrates these classes. Create at least one Vehicle object and output its member variables. 
	Then create at least one Sedan object, and output its member variables (including the inherited ones). 
	And then at least one Truck object and output its member variables, including inherited.
	*/

	// Here's some sample output 
	// (note that this output doesn't include the extra member variables that you must think about and put into your code);
	// meet this minimum requirement or improve on it:

	// Information about Vehicle "Motor Vehicle":
	// Year: 1992
	// Mileage: 40000

	// Information about Sedan "Yaris": 
	// Year: 1994
	// Mileage: 50500
	// Doors: 4
	// Hatchback: yes

	// Information about Truck "Pickup":
	// Year: 2015
	// Mileage: 20000
	// Towing capacity: 3000 tons
	// Number of axles: 2


	//Define your classes here for HW3.2

	public class Vehicle {

	}

	public class Sedan {

	}

	public class Truck {

	}

	//HW3.2 Ends Here

	//HW3.3 APCalendar (You will not use compiler here)
	// The APCalendar class contains methods used to calculate information about a calendar. You will write two
	// methods of the class.
	public static class APCalendar
	{
	 /** Returns true if year is a leap year and false otherwise. */
	 private static boolean isLeapYear(int year)
	 { /* implementation not shown */
	 	return 0; 
	 }

	 /** Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */
	 public static int numberOfLeapYears(int year1, int year2)
	 { /* to be implemented in part (a) */ 

	 	//Implement Your code Here for part A
	 	return 0; 
	 }

	 /** Returns the value representing the day of the week for the first day of year,
	 * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
	 */
	 private static int firstDayOfYear(int year)
	 { /* implementation not shown */ 
	 	return 0; 
	 }

	 /** Returns n, where month, day, and year specify the nth day of the year.
	 * Returns 1 for January 1 (month = 1, day = 1) of any year.
	 * Precondition: The date represented by month, day, year is a valid date.
	 */
	 private static int dayOfYear(int month, int day, int year)
	 { /* implementation not shown */ 
	 	return 0; 
	 }

	 /** Returns the value representing the day of the week for the given date
	 * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
	 * and 6 denotes Saturday.
	 * Precondition: The date represented by month, day, year is a valid date.
	 */
	 public static int dayOfWeek(int month, int day, int year)
	 { /* to be implemented in part (b) */ 
	 	//Implement Your code Here for part B
	 	return 0; 
	 }

	 // There may be instance variables, constructors, and other methods not shown.
	} 

	//Instructions: Part A
	// Write the static method numberOfLeapYears, which returns the number of leap years between
	// year1 and year2, inclusive.
	// In order to calculate this value, a helper method is provided for you.
	// • isLeapYear(year) returns true if year is a leap year and false otherwise.
	// Complete method numberOfLeapYears below. You must use isLeapYear appropriately to
	// receive full credit.
	/** Returns the number of leap years between year1 and year2, inclusive.
	 * Precondition: 0 <= year1 <= year2
	 */

	// Part B
	// Write the static method dayOfWeek, which returns the integer value representing the day of the week for
	// the given date (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6
	// denotes Saturday. For example, 2019 began on a Tuesday, and January 5 is the fifth day of 2019. As a result,
	// January 5, 2019, fell on a Saturday, and the method call dayOfWeek(1, 5, 2019)
	// returns 6.
	// As another example, January 10 is the tenth day of 2019. As a result, January 10, 2019, fell on a Thursday,
	// and the method call dayOfWeek(1, 10, 2019) returns 4.
	// In order to calculate this value, two helper methods are provided for you.
	// • firstDayOfYear(year) returns the integer value representing the day of the week for the first
	// day of year, where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. For
	// example, since 2019 began on a Tuesday, firstDayOfYear(2019) returns 2.
	// • dayOfYear(month, day, year) returns n, where month, day, and year specify the
	// nth day of the year. For the first day of the year, January 1 (month = 1, day = 1), the value
	// 1 is returned. This method accounts for whether year is a leap year. For example,
	// dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year, while
	// dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
	// public static int numberOfLeapYears(int year1, int year2)
	// Complete method dayOfWeek below. You must use firstDayOfYear and dayOfYear
	// appropriately to receive full credit.

	 /** Returns the value representing the day of the week for the given date
	 * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
	 * and 6 denotes Saturday.
	 * Precondition: The date represented by month, day, year is a valid date.
	 */

	//HW3.3 Ends Here


	public static void main(String args[]) {
		//Debug for Q1.
		Undergraduate u = new Undergraduate("Wonjae", "Econ");
		Graduate g = new Graduate("James", "Mechanical Engineering");
		g.research();
		u.study();
	}
}