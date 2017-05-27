package modulo5.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class ComparingPeriodAndDuration {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);

        System.out.println(date.plus(period));
        System.out.println(date.plus(days));
    }
}
