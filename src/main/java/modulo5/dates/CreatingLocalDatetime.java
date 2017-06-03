package modulo5.dates;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Created by JavierSainz on 5/25/17.
 */
public class CreatingLocalDatetime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.toEpochSecond(ZoneOffset.UTC));
    }
}
