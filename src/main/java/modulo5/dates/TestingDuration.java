package modulo5.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class TestingDuration {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(23);
        System.out.println(dateTime.plus(duration)); // 2015–01–21T15
        System.out.println(time.plus(duration));     // 15
        System.out.println(date.plus(duration));     // UnsupportedTemporalException
    }
}
