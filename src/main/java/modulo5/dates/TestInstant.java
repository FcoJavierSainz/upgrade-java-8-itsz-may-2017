package modulo5.dates;

import java.time.*;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class TestInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
// do something time consuming
        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

        //create Instant from ZonedDateTime
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2015–05–25T15:55:00Z
    }
}
