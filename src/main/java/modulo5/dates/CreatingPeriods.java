package modulo5.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class CreatingPeriods {
    public static void main(String[] args) {
        Period annually = Period.ofYears(1);               // every 1 year
        Period quarterly = Period.ofMonths(3);             // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3);        // every 3 weeks
        Period everyOtherDay = Period.ofDays(2);           // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7);     // every year and 7 days
        //Period.from(Duration.of(1000, ChronoUnit.DAYS));
        Period question = Period.ofYears(1).ofWeeks(1); // ??
        System.out.println(question);

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofDays(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period));

    }
}
