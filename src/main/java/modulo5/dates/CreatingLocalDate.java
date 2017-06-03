package modulo5.dates;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by JavierSainz on 5/25/17.
 */
public class CreatingLocalDate {
    public static void main(String[] args) {
        //create local date using of method with int and Enum for months
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2016, 2, 29);
        LocalDate date2 = LocalDate.of(2017, Month.JANUARY, 31);
        System.out.println(date);
        //using parse
        LocalDate date3 = LocalDate.parse("2016-02-29");
        System.out.println(date3);

        System.out.println(date1.isBefore(date2));
        //LocalDate d = new LocalDate();

        //LocalDate.of(2015, Month.JANUARY, 32);
    }
}
