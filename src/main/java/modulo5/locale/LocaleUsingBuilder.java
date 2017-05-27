package modulo5.locale;

import java.util.Locale;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class LocaleUsingBuilder {
    public static void main(String[] args) {
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        Locale l3 = new Locale.Builder()
                .setRegion("us")
                .setLanguage("EN")
                .build(); // valid??
    }
}
