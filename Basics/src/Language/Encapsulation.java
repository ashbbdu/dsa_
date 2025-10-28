package Language;

// BankAccount.java
 class BankAccount1 {
    // Step 1: Private variables — cannot be accessed directly from outside the class
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Step 2: Constructor to initialize the object
    public BankAccount1(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Step 3: Public getters and setters to access/modify private data safely
    public String getAccountNumber() {
        return accountNumber;
    }

    // No setter for accountNumber — to prevent changing it after creation
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Step 4: Public methods to perform controlled operations
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class Encapsulation {


    public static void main(String[] args) {
//        also known as data hiding
//        attributes should be private and should be accessible using getter and setter
//        BankDetails class
    }
}
