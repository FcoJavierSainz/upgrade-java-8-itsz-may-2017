package modulo5.dates;

import java.time.LocalDate;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class DatesWith {
    public static void main(String[] args) {
        LocalDate firstGame = LocalDate.of(2036,02,28);
        firstGame.withMonth(3);
        System.out.println(firstGame.withDayOfMonth(1));
        System.out.println(firstGame.withDayOfYear(1));
        System.out.println(firstGame.withMonth(7));
        System.out.println(firstGame.withYear(1));

    }
}
