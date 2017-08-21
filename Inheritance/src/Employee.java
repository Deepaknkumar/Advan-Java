
/**
 * Created by deepakkumar on 2017-08-13.
 * Taken from book Core Java vol 1
 */

import java.time.*;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public Employee(){
        name = "Alex Shealth";
        salary = 1000000;
        hireDay = LocalDate.now();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent;
        salary += raise;
    }
}
