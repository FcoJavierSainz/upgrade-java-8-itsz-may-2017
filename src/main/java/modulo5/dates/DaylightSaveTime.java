package modulo5.dates;

import java.time.*;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class DaylightSaveTime {
    public static void main(String[] args) {
        // https://en.wikipedia.org/wiki/Daylight_saving_time_in_the_United_States
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime);

        dateTime = dateTime.plusHours(1);

        System.out.println(dateTime);
        date = LocalDate.of(2016, Month.NOVEMBER, 6);
        time = LocalTime.of(1, 30);
        dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime);

        dateTime = dateTime.plusHours(1);

        System.out.println(dateTime);

        dateTime = dateTime.plusHours(1);

        System.out.println(dateTime);

    }

    public static void pointingInnexistingHour() {

        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(2, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);  // ??
    }
}
