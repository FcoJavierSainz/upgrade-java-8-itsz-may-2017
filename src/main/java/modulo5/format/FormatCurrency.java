package modulo5.format;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class FormatCurrency {
    public static void main(String[] args) {
        double price = 48;
        NumberFormat us = NumberFormat.getCurrencyInstance();
        System.out.println(us.format(price));
        System.out.println("  Unqualified:  " + Locale.getDefault());
        System.out.println("  Display:      " + Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("  Format:       " + Locale.getDefault(Locale.Category.FORMAT));
    }
}
