// Please fill in the blank 
public class hw2 {

  //HW 02 Q1. Bank Account
  public static class BankAccount {
    private String password;
    private double balance;
    public static final double OVERDRAWN_PENALTY = 20.00;
    //constructors
    /** Default constructor.
    * Constructs bank account with default values. */ 
    public BankAccount()
    { /* implementation code */ }
    /** Constructs bank account with specified password and balance. */ 
    public BankAccount(String acctPassword, double acctBalance)
    { /* implementation code */ }
    //accessor
    /** @return balance of this account */ 
    public double getBalance(){ 
      /* implementation code */ 
      return 1;
      }

    //mutators
    /** Deposits amount in bank account with given password.
    * @param acctPassword the password of this bank account
    * @param amount the amount to be deposited */
    public void deposit(String acctPassword, double amount) { 
    /* implementation code */ }

    /** Withdraws amount from bank account with given password.
    * Assesses penalty if balance is less than amount.
    * @param acctPassword the password of this bank account
    * @param amount the amount to be withdrawn
    */
    public void withdraw(String acctPassword, double amount) {
      /* implementation code */ }

    }

//HW 02 Q2. Bank Account
// Color is composed of three values; red, green, and blue.
// Your task is to create Color class that has appropriate private attriutes, public getters, and setters.

  public static class Color {
     /** Default constructor.
    * Constructs bank account with default values. */ 
    public Color()
    { /* implementation code */ }
    /** Constructs color object with specified red, green, and blue value*/ 
    public Color(int r, int g, int b)
    { /* implementation code */ }

    // Please define Your methods here
  }

//HW 02 Q3. Car
/*
-----------------------
          Car
-----------------------
- make: string // Or "Brand" of the car
- year : int
- speed: int
-----------------------
+ Car(string, int)
+ setMake(m: string) : void
+ getMake() : string
+ setYear(y: int) : void
+ getYear() : int
+ setSpeed(s: int) : void
+ getSpeed() : int
+ accelerate() : void 
+ brake() : void
----------------------
*/

// Note that there is only one constructor which receives arguments for and sets the make and year. Have your constructor then set the speed to zero.

// Note the two new member methods: accelerate and brake. Accelerate should increase speed by 5, 
// and brake should decrease speed by 5. Note that your speed can never be a negative number, 
// so ensure that your method definition guards against that by outputting an error message (see the sample output below for this).

// Sample Output:
// Accelerating...
// Toyota | 1998 | 5
// Accelerating...
// Toyota | 1998 | 10
// Accelerating...
// Toyota | 1998 | 15
// Braking...
// Toyota | 1998 | 10
// Braking...
// Toyota | 1998 | 5
// Braking...
// Toyota | 1998 | 0
// Braking... Error: can't brake a car that's standing still.
// Toyota | 1998 | 0

//Construct the Car class based on the UML Above;
public static class Car {
  //Your code here
}

//HW 02 Q4. Calculator
// Create a class "Calculator"
// It must only have a default constructor (Which means no parameter)
// It must have a method called add, subtract, multiply, and divide. 
// The methods should take only two parameters, num1 and num2. (for example, public int add(int num1, int num2){})
// Also, add, subtract, multiply, and divide method must be overloaded. The difference is that
// Their parameter type should be different (For example, double and int)
// In your default constructor, you must initiallize its private Boolean attribute "isPowerOn" to true.
public static class Calculator {
  // Your code here.
}

  //You can use your main method as a debugging purpose
  public static void main(String args[]) {
    BankAccount b = new BankAccount();
    System.out.println(b.getBalance());
  }
}