package com.horstmann.corejava;

import java.time.*;
/**
 * Created by deepakkumar on 2017-08-12.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name =  name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month,day);
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

    /**
     * Raises the salary of an employee.
     * @param byPercent the percentage by which to raise the salary (e.g 10 means 10%)
     *
     */
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent /100;
        salary += raise;
    }
}

