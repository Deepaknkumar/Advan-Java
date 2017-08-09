/**
 * Created by deepakkumar on 2017-08-08.
 */
public class StaticTest {

    public static void main(String[] args){
        employee[] staff = new employee[3];

        staff[0] = new employee("Tom",40000);
        staff[1] = new employee("Dick", 60000);
        staff[2] = new employee("Harry",65000);

        // print out information about all Employee objects
        for(employee e: staff){
        e.setId();
        System.out.println("name=" + e.getName() + " ,id=" + e.getId() + "Salary="+ e.getSalary());
        }

    }
}


class employee{

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public employee(String n, double s){
        name = n;
        salary = s;
        id = 0;
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

    public void setId(){
        id = nextId;    // Set id to next available id
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args){     // Unit test
        employee e = new employee("Harry", 50000);
        System.out.println(e.getName() +" " + e.getSalary());
    }

}