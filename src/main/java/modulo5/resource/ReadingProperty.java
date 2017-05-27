package modulo5.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class ReadingProperty {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");

        printProperties(us);
        System.out.println();
        printProperties(france);
    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Music", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("artist"));
    }
}
