/**
 * Created by deepakkumar on 2017-08-09.
 */
import java.util.*;

public class ConstructorTest {
    public static void main(String[] args){
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Harry",40000);
        staff[1] = new Employee2(60000);
        staff[2] = new Employee2();

        for(Employee2 e: staff){
            System.out.println("name=" + e.getName() + " ,id=" + e.getId() + "Salary="+ e.getSalary());
        }
    }
}

class Employee2{

    private static int nextId;

    private int id;
    private String name = ""; // Instance field initialization
    private double salary;

    // Static initialization block
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000); // Set nextId to a random number between 0 and 9999
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // Constructors
    public Employee2(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public Employee2(double salary){
        this("Employee #"+nextId, salary);
    }

    // default constructor
    public Employee2(){
        // All parameters initialized to initially set values
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}