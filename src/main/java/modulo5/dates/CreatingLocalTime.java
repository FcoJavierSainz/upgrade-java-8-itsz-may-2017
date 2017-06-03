package modulo5.dates;

import java.time.LocalTime;

/**
 * Created by JavierSainz on 5/25/17.
 */
public class CreatingLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("05:29:59.122334445");
        System.out.println(time);
    }
}
