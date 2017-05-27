package modulo5.format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class ParseNumber {
    public static void main(String[] args) throws ParseException {
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);

        String s = "40.45";
        System.out.println(en.parse(s));
        System.out.println(fr.parse(s));
    }
}
