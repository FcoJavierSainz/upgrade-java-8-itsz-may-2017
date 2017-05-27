package modulo5.dates;

import java.time.LocalDate;

/**
 * Created by JavierSainz on 5/25/17.
 */
public class PrintLocalDateInfo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.toEpochDay());
    }
}
