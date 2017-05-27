package modulo5.dates;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class UsingPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAction(start, end);
    }

    private static void performAction(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {          // check if still before end
            System.out.println("New iteration: " + upTo);
            upTo = upTo.plusMonths(1);           // add a month
        }
    }
}
