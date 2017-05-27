package modulo5.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class InstantiateDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
        System.out.println(shortDateTime.format(time));

        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        System.out.println(time.format(shortDateTime));
    }
}
