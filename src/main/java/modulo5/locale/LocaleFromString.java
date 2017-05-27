package modulo5.locale;

import java.util.Locale;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class LocaleFromString {
    public static void main(String[] args) {
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN
    }
}
