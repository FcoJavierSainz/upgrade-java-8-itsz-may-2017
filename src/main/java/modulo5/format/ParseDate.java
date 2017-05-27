package modulo5.format;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class ParseDate {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);          // 2015–01–02
        System.out.println(time);          // 11:22
    }
}
