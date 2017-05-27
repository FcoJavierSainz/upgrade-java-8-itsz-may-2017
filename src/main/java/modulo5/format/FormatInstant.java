package modulo5.format;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class FormatInstant {
    public static void main(String[] args) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                        .withZone(ZoneId.systemDefault());
        System.out.println(formatter.format(Instant.now()));
    }
}
