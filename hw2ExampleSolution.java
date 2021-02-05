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
    public BankAccount() {
      password = "";
      balance = 0.0;
    }
    /** Constructs bank account with specified password and balance. */ 
    public BankAccount(String acctPassword, double acctBalance) {
      password = acctPassword;
      balance = acctBalance;
    } 
    //accessor
    /** @return balance of this account */ 
    public double getBalance(){ 
      return balance;
    }

    //mutators
    /** Deposits amount in bank account with given password.
    * @param acctPassword the password of this bank account
    * @param amount the amount to be deposited */
    public void deposit(String acctPassword, double amount) { 
      balance += amount;
    }

    /** Withdraws amount from bank account with given password.
    * Assesses penalty if balance is less than amount.
    * @param acctPassword the password of this bank account
    * @param amount the amount to be withdrawn
    */
    public void withdraw(String acctPassword, double amount) {
      // 비번확인, 잔고확인.
      if (password == acctPassword) { // 만약 계좌 비밀번호가 input비밀번호와 같다면;
        if (balance < amount) { // 출금액이 계좌 잔고보다 많음.
          System.out.println("Low Balance");
          balance -= OVERDRAWN_PENALTY;
        } else { // 출금액이 계좌 잔고보다 적음
          System.out.println("Withdraw successful!");
          balance -= amount;
          balance = balance - amount;
        }
      } else { // 비밀번호가 틀렸을경우
        System.out.println("Wrong Password");
      }
    }

    }

//HW 02 Q2. Color
// Color is composed of three values; red, green, and blue.
// Your task is to create Color class that has
// appropriate private attriutes, public getters, and setters.

  public static class Color {

    private int red;
    private int green;
    private int blue;
     /** Default constructor.
    * Constructs bank account with default values. */ 
    public Color()
    { /* implementation code */ }
    /** Constructs color object with specified red, green, and blue value*/ 
    public Color(int r, int g, int b)
    { 
      red = r;
      green = g;
      blue = b;
    }

    public int getRed() {
      return red;
    }

    public int getGreen() {
      return green;
    }

    public int getBlue() {
      return blue;
    }

    public void setRed(int r) {
      red = r;
    }
    
    public void setGreen(int g) {
      green = g;
    }
    public void setBlue(int b) {
      blue = b;
    }

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

// Note that there is only one constructor which receives arguments for and sets the make and year.
// Have your constructor then set the speed to zero.
// Note the two new member methods: accelerate and brake.
// Accelerate should increase speed by 5, 
// and brake should decrease speed by 5. Note that your speed can never be a negative number, 
// so ensure that your method definition guards
// against that by outputting an error message (see the sample output below for this).

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
  // 생략

  private int speed;  
  private String make;
  private int year;

  public Car(String m, int y) {
    make = m;
    year = y;
  }
  public void setMake(String m) {
    make = m;
  }
  public String getMake() {
    return make;
  }
  public void setYear(int y) {
    year = y;
  }
  public int getYear() {
    return year;
  }
  public void setSpeed(int s) {
    speed = s;
  }
  public int getSpeed() {
    return speed;
  }

  public void accelerate() {
    speed += 5;
    System.out.println("Accelerating...");
    System.out.println(make +"|" + year + "|" + speed);
  }
  public void brake() {
    //음수를 체크를 하자
    if (speed < 0) { // 속도가 0일 때
      System.out.println("Error: can't brake a car that's standing still.");
    } else { // 속도가 0보다 클때,
      speed -= 5;
      System.out.println("Braking...");
      System.out.println(make + "|" + year + "|" + speed);
    }
  }
}

//HW 02 Q4. Calculator
// Create a class "Calculator"
// It must only have a default constructor (Which means no parameter)
// It must have a method called add, subtract, multiply, and divide. 
// The methods should take only two parameters, num1 and num2. 
//(for example, public int add(int num1, int num2){})
// Also, add, subtract, multiply, and divide method must be overloaded.
// The difference is that
// Their parameter type should be different (For example, double and int)
// In your default constructor, you must initiallize its private Boolean attribute "isPowerOn" to true.
public static class Calculator {

  private Boolean isPowerOn;

  public Calculator() {
    isPowerOn = true;
  }

  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public int divide(int num1, int num2) {
    return num1 / num2;
  }

  public int add(int num1, int num2, int num3) {
    return num1 + num2 + num3 ;
  }

  public int subtract(int num1, int num2, int num3) {
    // subtract
    return num1 - num2 - num3 ;
  }

  public int multiply(int num1, int num2, int num3) {
    // multiply
    return num1 * num2 * num3 ;
  }

  public int divide(int num1, int num2, int num3) {
    // divide
    return num1 / num2 / num3 ;
  }

}

  //You can use your main method as a debugging purpose
  public static void main(String args[]) {
    BankAccount b = new BankAccount();
    System.out.println(b.getBalance());
  }
}