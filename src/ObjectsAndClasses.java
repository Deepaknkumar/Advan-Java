/**
 * Created by deepakkumar on 2017-07-17.
 */
import java.util.*;
import java.time.*;

public class ObjectsAndClasses {

    public static void main(String[] args){
        System.out.println(new Date());

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);

        LocalDate newYearsEve = LocalDate.of(1994,12,31);
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        int year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        int day = aThousandDaysLater.getDayOfMonth();

        System.out.println(year +"\n"+ month+"\n" +day);

    }

}
