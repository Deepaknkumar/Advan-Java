package equals;

import java.util.Objects;
import abstractClasses.Employee;

/**
 * Created by deepakkumar on 2017-08-20.
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)){return false;}

        Manager other = (Manager) otherObject;
        // super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }

    public int hashCode(){
        return super.hashCode() + Objects.hashCode(bonus);
    }

    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
