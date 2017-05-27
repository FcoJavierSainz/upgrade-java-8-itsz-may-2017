package modulo5.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class FormatCustomPattern {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy,'M' hh:mm");
        System.out.println(dateTime.format(f));     // January 20, 2020, 11:12
    }
}
