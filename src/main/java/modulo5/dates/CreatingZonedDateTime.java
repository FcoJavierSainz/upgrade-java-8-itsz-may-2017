package modulo5.dates;

import java.time.*;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class CreatingZonedDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20,
                6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime, zone);
        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        System.out.println(zoned1.toEpochSecond());
    }
}
