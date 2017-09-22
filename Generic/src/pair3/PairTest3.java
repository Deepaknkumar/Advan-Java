package pair3;

import abstractClasses.Employee;
import pair1.Pair;

/**
 * Created by deepakkumar on 2017-09-21.
 * Taken from book core java 1.
 */
public class PairTest3 {


    public static void printBuddies( Pair<? extends Employee> p){
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }
}
