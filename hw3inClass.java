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
			name = "";
			major = "";
		}

		public Undergraduate(String n, String m) {
			super(n);
			major = m;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String m) {
			major = m;
		}

		@Override
		public void study() {
			System.out.println("Studying is fun");
		}
	}

	public static class Graduate extends Student{

		private String researchingArea;

		public Graduate(String n, String r) {
			super(n);
			researchingArea = r;
		}

		public String getResearchArea() {
			return researchingArea;
		}

		public void setResearchArea(String r) {
			researchingArea = r;
		}

		@Override
		public void study() {
			System.out.println("studying is hard.");
		}

		public void research() {
			System.out.println("I research" + researchingArea);
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
		private int year;
		private int mileage;

		public Vehicle() {
			year = 0;
			mileage = 0;
		}

		public Vehicle(int y, int m) {
			year = y;
			mileage = m;
		}

		public void setYear(int y) {
			year = y;
		}

		public void setMileage(int m) {
			mileage = m;
		}

		public void print() {
			//유용한 정보를 프린트해라
		}
	}

	public class Sedan extends Vehicle {

		private int doors;
		private Boolean hatchback;

		public Sedan() {
			super();
			doors = 0;
			hatchback = false;
		}

		public Sedan(int y, int m, int d, Boolean h) {
			super(y,m);
			doors = d;
			hatchback = h;
		}

		public void printVehicle() {
			//유용한 정보 푸린트
		}
	}

	public class Truck {

		private int towingCapacity;
		private int numberOfAxles;

		//Constructor

		// print
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
		int count = 0;
		for (int y = year1; y <= year2; y++) {
			if (isLeapYear(y)) {
		 		count++;
			}
		}
		return count
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
	 	 int startDay = firstDayOfYear(year);
		 int nthDay = dayOfYear(month, day, year);
		 int returnDay = (startDay + nthDay - 1) % 7;
		 return returnDay;
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

	// HW3.4 Cars!
	// Create a class "AICar" and "ManualCar".
	// They should inherit the provided abstract class Car.
	// Do not edit the provided class Car.
	// AICar class should override the method "drive" and it should print "AI car is runnig."
	// AICar class should override the method "stop" and it should print "AI car stopped."
	// ManualCar class should have private String attribute "driver".
	// ManualCar class should contain its unique method "driverName" and it should print string “Driver is (driver).” For example, if string “driver” is set as “John” in the constructor, the method driverName should print “Driver is John.”.
	// ManualCar class should override the method "drive" and it should print "A man drives a car."
	// ManualCar class should override the method "stop" and it should print "A man stopped a car."
	// Hint: You should declare an appropriate constructor for ManualCar class.

public abstract class Car{
	public String type = "Vehicle";
	public abstract void drive();
	public abstract void stop();
}

public class AICar extends Car{

	public void drive(){
		system.out.println("AI Car is running.");
	}
	public void stop(){
		system.out.println("AI Car stopped.");
	}
}
public class ManualCar extends Car{

	private String driver;

	public ManualCar(String name){
		driver = name;
	}
	public void drive(){
		system.out.println(“A man drives a car.”);
	}
	public void stop(){
		system.out.println(“A man stopped a car.”);
	}
	public void driver(){
		System.out.println("Driver is "+ driver + ".");
	}
}



// HW3.4 Ends Here

// HW3.5 Animal Farm!
// An interface is a completely "abstract class"
// that is used to group related methods with empty bodies:
// Create three classees that implements the interface Animal. 

interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// NOTE: Your animalSound() method should print different messages for
// each of the classes. For example, dogs and cats have different sounds.
// NOTE: Your sleep() method should also print different messages for 
// for each of the classes. You are welcome to add more methods in Animal
// Interface, however,you should not delete animalSound() and sleep().

class Pig implements Animal {

	public void animalSound() {
	    // The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
	    // The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

class Lion implements Animal {
	
	public void animalSound() {
	    // The body of animalSound() is provided here
		System.out.println("어흥");
	}
	public void sleep() {
	    // The body of sleep() is provided here
		System.out.println("쿨쿨");
	}
}

class Dragon implements Animal {
	
	public void animalSound() {
	    // The body of animalSound() is provided here
		System.out.println("dragon");
	}
	public void sleep() {
	    // The body of sleep() is provided here
		System.out.println("good");
	}
}

// HW 3.5 Ends Here

}