package abstractClasses;

/**
 * Created by deepakkumar on 2017-08-20.
 */
public class PersonTest {

    public static void main(String[] args){

        Person[] people = new Person[2];

        // fill people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student ("Maria Morris","Computer Science");

        // print out names and descriptions of all Person objects
        for (Person p:people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }

        String s = "OK";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());
        String t = new String("OK");
        StringBuilder tb = new StringBuilder(t);
        System.out.println(t.hashCode()+ " " + tb.hashCode());
    }
}
