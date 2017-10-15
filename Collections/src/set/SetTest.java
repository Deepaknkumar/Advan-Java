package set;

import java.util.*;
/**
 * Created by deepakkumar on 2017-10-14.
 * From book Core Java vol 1
 */

public class SetTest {

    public static void main(String[] args){
        Set<String> words = new HashSet<>();
        int count=0;
        long totalTime = 0;

        try(Scanner in = new Scanner(System.in)){
            while(in.hasNext()){
                String word = in.next();
                System.out.println(word);
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis()-callTime;
                totalTime += callTime;
                count++;
                if(count>=7){break;}
            }
        }

        Iterator<String> iter = words.iterator();
        for(int i=1; i<= 20 && iter.hasNext(); i++){
            System.out.println(iter.next());
        }
        System.out.println("...");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
