/**
 * Created by deepakkumar on 2017-08-13.
 * Taken from book Core Java vol 1
 */
public class ManagerTest {

    public static void main(String args[]){

        Manager boss = new Manager("Carl Cracker", 80000, 1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee();

        // print out the information about all the employee objects
        for(Employee e:staff){
            System.out.println("name=" + e.getName() + " Salary=" + e.getSalary());
        }
    }
}
