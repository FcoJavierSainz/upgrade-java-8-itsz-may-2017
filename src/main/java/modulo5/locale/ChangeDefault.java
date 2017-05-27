package modulo5.locale;

import java.util.Locale;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class ChangeDefault {
    public static void main(String[] args) {
        Locale locale = new Locale("fr");
        Locale.setDefault(locale);               // change the default
        System.out.println(Locale.getDefault());// ??
    }
}
