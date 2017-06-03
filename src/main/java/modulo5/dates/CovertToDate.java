package modulo5.dates;

import java.time.*;
import java.util.Date;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class CovertToDate {
    public static void main(String[] args) {
        //convert LocalDate, LocalDateTime and ZonedDateTime to Date
        LocalDate date = LocalDate.now();
        long milli = ZonedDateTime.of(date,
                LocalTime.of(0, 0), ZoneId.of("America/Mexico_City"))
                .toInstant()
                .toEpochMilli();
        System.out.println(new Date(milli));

    }
}
