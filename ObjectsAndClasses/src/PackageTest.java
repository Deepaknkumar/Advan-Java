import com.horstmann.corejava.*;
/**
 * Created by deepakkumar on 2017-08-12.
 */

import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args){
        Employee harry = new Employee("Harry Hacker",50000,1989,10,1);
        harry.raiseSalary(5);
        out.println("name="+harry.getName() + ",salary=" + harry.getSalary());
    }
}
