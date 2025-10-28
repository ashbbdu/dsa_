package Language;

class Employee {
    public String name;
    public int salary;


//   Default Constructor
    public Employee () {

    }

//    Parameterized Constructor
    public Employee (String _name , int _salary) {
       name = _name;
       salary = _salary;
    }

   public  String getName () {
        return name;
    }



}

class Student {
//    public String name;
//    public int rollNumber;

    private String name;
    private int rollNumber;

    public Student () {
        this.name = "Test";
        this.rollNumber = 1;
    }

    public Student (String _name , int _rollNumber) {
        this.name = _name;
        this.rollNumber = _rollNumber;
    }

//    public void setDetails (String _name , int _rollNumber) {
//        this.name = _name;
//        this.rollNumber = _rollNumber;
//    }
//
//    public void displayDetails () {
//        System.out.println("Name : " + this.name);
//        System.out.println("Roll Number : " + this.rollNumber);
//    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void getDetails () {
        System.out.println("Name : " +  getName());
        System.out.println("Roll Number : " + getRollNumber());
    }

    public void setName (String _name) {
        this.name = _name;
    }

    public void setRollNumber (int _rollNumber) {
        this.rollNumber = _rollNumber;
    }
}


class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount (String _accountNumber , double _balance) {
        this.accountNumber = _accountNumber;
        this.balance = _balance;
    }

    public void deposit (double _amount) {
        balance = balance + _amount;
    }

    public void withdraw (double _amount) {
        if(balance > _amount) {
            balance = balance - _amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayDetails () {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + String.format("%.2f", balance));
    }
}

public class IntroOOPs {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashish" , 1000000000);
        e1.name = "ash";
        System.out.println(e1.getName());

        Student student = new Student();
        student.setName("Ashish");
        student.setRollNumber(25);

        student.getDetails();


        BankAccount b1 = new BankAccount("122345" , 10.00);

        b1.deposit(99);

       b1.displayDetails();

    }
}
