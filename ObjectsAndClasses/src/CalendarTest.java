/**
 * Created by deepakkumar on 2017-07-17.
 */

import java.time.*;

public class CalendarTest {

    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
    }

}