package Language;

class Employee {
    public String name;
    public int salary;


//    Constructor
    public Employee (String _name , int _salary) {
       name = _name;
       salary = _salary;
    }

   public  String getName () {
        return name;
    }



}

class Student {
    public String name;
    public int rollNumber;

//    public Student (String _name , int _rollNumber) {
//        this.name = _name;
//        this.rollNumber = _rollNumber;
//    }

    public void setDetails (String _name , int _rollNumber) {
        this.name = _name;
        this.rollNumber = _rollNumber;
    }

    public void displayDetails () {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}

public class IntroOOPs {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashish" , 1000000000);
        e1.name = "ash";
        System.out.println(e1.getName());

        Student student = new Student();
        student.name = "ashish";
        student.rollNumber = 21;
        student.displayDetails();
    }
}
