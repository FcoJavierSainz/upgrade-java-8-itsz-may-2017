package modulo5.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class ManipulatingDates {
    public static void main(String[] args) {

        // adding
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        // subtracting
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        date2.plusDays(10);
        System.out.println(date2);

        //date2 = date2.plusMinutes(1);
        System.out.println(date2);

    }
}
