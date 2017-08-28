package interfaces;

import java.util.Comparator;

/**
 * Created by deepakkumar on 2017-08-27.
 */
public class LengthComparator implements Comparator<String> {
    public int compare(String first, String second){
        return first.length() - second.length();
    }
}
