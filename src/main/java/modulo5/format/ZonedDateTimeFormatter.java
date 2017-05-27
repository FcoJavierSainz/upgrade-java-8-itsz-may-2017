package modulo5.format;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class ZonedDateTimeFormatter {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("es", "MX"));
        LocalDateTime ldt = LocalDateTime.of(2016, 6, 11, 10, 10, 0);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("America/Mexico_City"));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM).format(ldt));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zdt));
    }
}
