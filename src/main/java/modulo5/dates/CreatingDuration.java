package modulo5.dates;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class CreatingDuration {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);                // PT24H
        Duration hourly = Duration.ofHours(1);              // PT1H
        Duration everyMinute = Duration.ofMinutes(1);       // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10);  // PT10S
        Duration everyMilli = Duration.ofMillis(1);         // PT0.001S
        Duration everyNano = Duration.ofNanos(1);           // PT0.000000001S

        daily = Duration.of(1, ChronoUnit.DAYS);
        hourly = Duration.of(1, ChronoUnit.HOURS);
        everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        everyNano = Duration.of(1, ChronoUnit.NANOS);
    }
}
