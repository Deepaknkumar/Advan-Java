package abstractClasses;

/**
 * Created by deepakkumar on 2017-08-13.
 * Taken from book Core Java vol 1
 */
public class Manager extends Employee {

    private double bonus;

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)){
            return false;
        }
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public String toString(){
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
