package map;

/**
 * Created by deepakkumar on 2017-10-16.
 */
public class Employee {

    private String name;

    public Employee(String aName){
        this.name = aName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "[ " + name + " ]";
    }
}
