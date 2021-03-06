package abstractClasses;

import java.time.*;
import java.util.Objects;

/**
 * Created by deepakkumar on 2017-08-20.
 */
public class Employee extends Person{

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public int hashCode(){
        return Objects.hash( this.getName(), salary, hireDay);
    }

    public String toString(){
        return getClass().getName()
                + "[name=" + this.getName()
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }

    public boolean equals(Object otherObject){
        // a quick test to see if the objects are identical
        if(this == otherObject){ return true;}

        // must return false if the explicit parameter is null
        if(otherObject == null){
            return false;
        }

        // if the classes don't match, they can't be equal
        if(getClass()!= otherObject.getClass()){
            return false;
        }

        // now we know otherObject is non-null Employee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        return this.getName().equals(other.getName()) &&
                salary == other.salary
                && hireDay.equals(other.hireDay);
    }
}
