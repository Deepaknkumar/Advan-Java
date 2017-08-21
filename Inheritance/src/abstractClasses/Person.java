package abstractClasses;

/**
 * Created by deepakkumar on 2017-08-20.
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
