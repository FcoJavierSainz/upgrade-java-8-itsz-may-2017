package modulo5.dates;

import java.time.ZoneId;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class FindTimeZones {
    public static void main(String[] args) {
        System.out.println("Default time zone:" +
                ZoneId.systemDefault());


        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted().forEach(System.out::println);
    }
}
