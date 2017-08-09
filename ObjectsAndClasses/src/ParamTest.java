/**
 * Created by deepakkumar on 2017-08-09.
 */
public class ParamTest {
    public static void main(String[] args){
        // Test 1: Methods can't modify numeric parameters
        System.out.println("Testing triple Value");
        double percent = 10;
        System.out.println("Before percent =" + percent);
        tripleValue(percent);
        System.out.println("After percent=" + percent);

        // Test 2: Methods can change the state of object parameters
        System.out.println("\n Testing tripleSalary");
        Employee1 harry = new Employee1("Harry",50000);
        System.out.println("Before: Salary=" + harry.getSalary() );
        tripleSalary(harry);
        System.out.println("After: Salary=" + harry.getSalary());

        // Test 3: Method's cant attach new objects to object parameters
        System.out.println("\nTesting Swap:");
        Employee1 a = new Employee1("Alice",70000);
        Employee1 b = new Employee1("Bob",60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a,b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x){
        x = 3*x;
        System.out.println("End of method: x=" + x); // Value of x get tripled but
    }                                                   // with the end of method, value of x is abandoned

    public static void tripleSalary(Employee1 x) { // works fine
    x.raiseSalary(200);
    System.out.println("End of Method: Salary=" + x.getSalary());
    }

    public static void swap(Employee1 x, Employee1 y){    // doesnot work
        Employee1 temp = x;
        x= y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee1{    // Simplified Employee class
    private String name;
    private double salary;

    public Employee1(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}