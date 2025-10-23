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

public class IntroOOPs {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashish" , 1000000000);
        e1.name = "ash";
        System.out.println(e1.getName());
    }
}
