// Please fill in the blank 
public class hw2 {

  //HW 02 Q1. Bank Account
  public class BankAccount {
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
      return 0.1;
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

  //HW 02 Q2.
  // Java's constructor can have multiple form. We call this a constructor overloading
  // create a Car class that has multiple constructors.
  // Your Class must have at least 3 different constructors.
  public class Car {
    ;
  }

  //You can use your main method as a debugging purpose
  public static void main(String args[]) {
    System.out.println("hi");
  }
}