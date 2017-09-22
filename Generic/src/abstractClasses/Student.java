package abstractClasses;

/**
 * Created by deepakkumar on 2017-08-20.
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in "+ major;
    }
}
